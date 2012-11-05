package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class GoodsRouting {

	private static Node[] nodes = null;
	private static double allowedTime = -1;
	public static void main(String[] args) throws Exception{
		
		int nodeCount=0,deliveryPointCount=0;
		Set<Integer> deliveryPoints=new HashSet<Integer>();
		//BufferedReader br = new BufferedReader(new FileReader(new File("input_goods_routing.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		nodeCount=Integer.parseInt(st.nextToken());
		deliveryPointCount=Integer.parseInt(st.nextToken());
		
		// Nodes and deliveryPoint count prepared
		
		//deliveryPoints = new int[deliveryPointCount];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<deliveryPointCount;i++){
			deliveryPoints.add(Integer.parseInt(st.nextToken()));
		}
		
		// DeliveryPoints prepared
		nodes = new Node[nodeCount];
		for(int i=0;i<nodeCount;i++){
			Node node = new Node();
			nodes[i]=node;
			node.level=i;
			if(deliveryPoints.contains(node.level)) node.isRequired = true;
		}
		
		for(int i=0;i<nodeCount-1;i++){
			st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			double p = Double.parseDouble(st.nextToken());
			
			nodes[x].timeToNodes.put(nodes[y],d*p);
			nodes[y].timeToNodes.put(nodes[x],d*p);
			
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int boyCost = Integer.parseInt(st.nextToken());
		double averageSpeed = Double.parseDouble(st.nextToken());
		double pertrolCost = Double.parseDouble(st.nextToken());
		allowedTime =  Integer.parseInt(st.nextToken());
		
		
		int startNode = 0;	// Considering startNode is at 0 index.
		
		populateCalculationForNode(nodes[startNode], null);
		
		List<DeliveryBoy> boys = new ArrayList<DeliveryBoy>();
		DeliveryBoy db1 = new DeliveryBoy();
		boys.add(db1);
		db1.reversePath = nodes[startNode].reversePath;
		db1.singleTraverse = nodes[startNode].singleTraverse;
		
		
		double maxNonmaxValue = -1;
		Node maxNonMaxNode = null;
		Path maxPath = null;
		if(nodes[startNode].time>allowedTime){
			while(nodes[startNode].time>allowedTime){
				maxPath=null;
				maxNonmaxValue = -1;
				maxNonMaxNode = null;
				
				if(db1.reversePath.empty()){
					//System.out.println("No solution exists!!!!");
					break;
				}
				
				for(Path reversePathValue : db1.reversePath){
					if(maxNonmaxValue<nodes[reversePathValue.end].tgb+nodes[startNode].timeToNodes.get(nodes[reversePathValue.end])){
						maxNonmaxValue = nodes[reversePathValue.end].tgb+nodes[startNode].timeToNodes.get(nodes[reversePathValue.end]);
						maxNonMaxNode = nodes[reversePathValue.end];
						maxPath = reversePathValue;
					}
				}
				// add new DeliverBoy and assign maxNonmaxNode's Path to that boy.
				
				db1.reversePath.remove(maxPath);
				DeliveryBoy dbNew = new DeliveryBoy();
				boys.add(dbNew);
				dbNew.singleTraverse = maxPath;
				
				//reindex maxPath
				Node currNode = maxNonMaxNode;
				double maxNodeValue = -1;
				Node maxNode = null;
				while(currNode.singleTraverse==null && currNode.reversePath.size()>0){
					Path singlePath = null;
					for(Path revPath : maxNonMaxNode.reversePath){
						double currNodeValue = nodes[revPath.end].time+(2*nodes[maxNonMaxNode.level].timeToNodes.get(nodes[revPath.end]))+nodes[revPath.end].tgb;
						if(currNodeValue>maxNodeValue){
							maxNode=nodes[revPath.end];
							maxNodeValue=currNodeValue;
							singlePath=revPath;
						}
					}
					currNode.reversePath.remove(singlePath);
					currNode.singleTraverse=singlePath;
					currNode = nodes[singlePath.end];
				}
				
				
				
				double deduction = maxNonMaxNode.tgb+nodes[nodes[startNode].level].timeToNodes.get(maxNonMaxNode);
				nodes[startNode].time -= deduction;
				
				//System.out.println("Time left : "+nodes[startNode].time);
				
			}
			
		}
		int i=0;
		for(DeliveryBoy boy : boys){
			List<String> paths= printPath(boy);
			System.out.println(paths.size());
			for(String path : paths){
				System.out.println(path);
			}
		}
		
	}
	
	// if false returned means no child is required below this parent :  hence current node can be removed from parent.
	// true means required
	
	private static boolean populateCalculationForNode(Node node,Node parent){
		//parents.add(node);
		double maxNodesValue = -1;
		Node maxNode = null;
		Stack<Path> minNodeStack = new Stack<Path>();
		Path maxNodePath = null;
		boolean parentFound = false;
		boolean extraNodeFound = false;
		
		node.reversePath.clear();
		node.singleTraverse = null;
		node.time=-1;
		node.tgb=-1;
		
		
		for(Node childNode : node.timeToNodes.keySet()){
			if(childNode.equals(parent)){
				parentFound=true;				
			}else{
				//minNodeStack.push("*************************************************************From "+node.level+" to "+childNode.level);
				//System.out.println("Pushing  : "+node.level+" : "+childNode.level);
				if(!populateCalculationForNode(childNode, node)){
					node.timeToNodes.remove(childNode);
					node.time=0;
					node.tgb=0;
					node.reversePath.clear();
					return false;
				}
				minNodeStack.push(new Path(node.level, childNode.level));
				extraNodeFound=true;
				double currNodeValue = 0;
				currNodeValue = childNode.time+(2*nodes[node.level].timeToNodes.get(childNode))+childNode.tgb;
				if(currNodeValue>maxNodesValue){
					maxNodesValue=currNodeValue;
					maxNode=childNode;
					Path temp = minNodeStack.pop();
					if(maxNodePath!=null){
						minNodeStack.push(maxNodePath);
					}
					maxNodePath=temp;
				}
			}
		}
		
		if(parentFound && !extraNodeFound){
			// Leaf Node
			node.time=0;
			node.tgb=0;
			node.reversePath.clear();
			if(!node.isRequired) return false;
		}
		else{
			double time = maxNode.time+nodes[node.level].timeToNodes.get(maxNode);
			for(Node nonMaxChildNode : node.timeToNodes.keySet()){
				if(nonMaxChildNode!=parent && !nonMaxChildNode.equals(maxNode)){
					time+=(nonMaxChildNode.time+nonMaxChildNode.tgb+(2*nodes[node.level].timeToNodes.get(nonMaxChildNode)));
					
					// Correcting the child nodes traverse path for singleTraverse
					if(null!=nonMaxChildNode.singleTraverse){
						nonMaxChildNode.reversePath.push(nonMaxChildNode.singleTraverse);
						nonMaxChildNode.singleTraverse=null;
					}
				}
			}
			node.time = time;
			node.tgb = maxNode.tgb+nodes[node.level].timeToNodes.get(maxNode);
			node.reversePath.addAll(minNodeStack);
			node.singleTraverse=maxNodePath;
			
		}
		
		return true;
	}
	public static void printPath(Node node,List<String> paths){
		for(Path reversePathValue : node.reversePath){
			paths.add(reversePathValue.start+" "+reversePathValue.end);
			printPath(nodes[reversePathValue.end],paths);
			paths.add(reversePathValue.end+" "+reversePathValue.start);
		}
		if(node.singleTraverse!=null){
			paths.add(node.singleTraverse.start+" "+node.singleTraverse.end);
			printPath(nodes[node.singleTraverse.end],paths);
		}
	}
	
	public static List<String> printPath(DeliveryBoy boy){
		List<String> paths = new ArrayList<String>();
		for(Path reversePathValue : boy.reversePath){
			paths.add(reversePathValue.start+" "+reversePathValue.end);
			printPath(nodes[reversePathValue.end],paths);
			paths.add(reversePathValue.end+" "+reversePathValue.start);
		}
		if(boy.singleTraverse!=null){
			paths.add(boy.singleTraverse.start+" "+boy.singleTraverse.end);
			printPath(nodes[boy.singleTraverse.end],paths);
		}
		return paths;
	}
	
	
	static class Node{
		int level=-1;
		double time=-1;		// time to traverse all its child nodes in minimum time.
		double tgb=-1;		// time to get back to this node after traversing child nodes in minimum time.
		
		Map<Node,Double> timeToNodes = new HashMap<Node,Double>();
		Stack<Path> reversePath = new Stack<Path>();
		Path singleTraverse = null;
		
		boolean isRequired = false;
		
		public boolean equals(Object node){
			if(node instanceof Node && this.level!=-1 && ((Node)node).level==this.level)
				return true;
			return false;
		}
	}
	
	static class DeliveryBoy{
		Stack<Path> reversePath = new Stack<Path>();
		Path singleTraverse = null;
	}
	
	static class Path{
		int start=-1;
		int end=-1;
		int deliveryBoyIndex = 0;
		public Path(int start,int end){
			this.start=start;
			this.end=end;
		}
	}
	

}
