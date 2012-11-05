package interviewstreet.codesprint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class EvenTree {

	public static int removedCount = 0;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("input_eventree.txt")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Integer verticesCount = Integer.parseInt(st.nextToken());
		Integer edgeCount = Integer.parseInt(st.nextToken());
		
		Map<Integer,List<Integer>> tree = new HashMap<Integer,List<Integer>>();
		int[] parentDetail = new int[verticesCount];
		
		for(int i=0;i<verticesCount;i++)parentDetail[i]=-1;
		
		for(int edgeCounter=0;edgeCounter<edgeCount;edgeCounter++){
			st = new StringTokenizer(br.readLine()," ");
			int verA = Integer.parseInt(st.nextToken())-1;
			int verB = Integer.parseInt(st.nextToken())-1;
			List<Integer> childs = null;
			if(parentDetail[verB]==-1){
				if((childs=tree.get(verA))==null || childs.size()==0){
					childs=new ArrayList<Integer>();
				}
				childs.add(verB);
				tree.put(verA, childs);
				parentDetail[verB]=verA;
				System.out.println("Adding "+(verB+1)+" to "+(verA+1)+" child list");
			}else{
				if((childs=tree.get(verB))==null || childs.size()==0){
					childs=new ArrayList<Integer>();
				}
				childs.add(verA);
				tree.put(verB, childs);
				parentDetail[verA]=verB;
				System.out.println("Adding "+(verA+1)+" to "+(verB+1)+" child list");
			}
		}
		int root = -1;
		for(int i=0;i<verticesCount;i++)if(parentDetail[i]==-1){root=i;break;}
		System.out.println("Root is "+root);
		processForChildCount(root, tree);
		System.out.println(removedCount);
	}
	
	private static int processForChildCount(Integer node,Map<Integer,List<Integer>> tree){
		List<Integer> childs = null;
		if((childs=tree.get(node))==null || childs.size()==0){
			return 1;
		}else{
			int retVal = 0;
			for(Integer child : childs){
				int currChildRet = processForChildCount(child,tree);
				System.out.println(" For node "+(child+1)+" return child count is : "+currChildRet);
				if(currChildRet%2==0){
					System.out.println("Removed node for "+(node+1)+"'s child "+(child+1));
					removedCount++;
				}
				else{
					retVal+=currChildRet;
				}
			}
			System.out.println("Returning "+(retVal+1)+" from node"+(node+1));
			return ++retVal;
		}
	}
	
}

/*


import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class EvenTree {

	public static int removedCount = 0;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		Integer verticesCount = Integer.parseInt(st.nextToken());
		Integer edgeCount = Integer.parseInt(st.nextToken());
		
		Map<Integer,List<Integer>> tree = new HashMap<Integer,List<Integer>>();
		int[] parentDetail = new int[verticesCount];
		
		for(int i=0;i<verticesCount;i++)parentDetail[i]=-1;
		
		for(int edgeCounter=0;edgeCounter<edgeCount;edgeCounter++){
			st = new StringTokenizer(br.readLine()," ");
			int verA = Integer.parseInt(st.nextToken())-1;
			int verB = Integer.parseInt(st.nextToken())-1;
			List<Integer> childs = null;
			if(parentDetail[verB]==-1){
				if((childs=tree.get(verA))==null || childs.size()==0){
					childs=new ArrayList<Integer>();
				}
				childs.add(verB);
				tree.put(verA, childs);
				parentDetail[verB]=verA;
			}else{
				if((childs=tree.get(verB))==null || childs.size()==0){
					childs=new ArrayList<Integer>();
				}
				childs.add(verA);
				tree.put(verB, childs);
				parentDetail[verA]=verB;
			}
		}
		int root = -1;
		for(int i=0;i<verticesCount;i++)if(parentDetail[i]==-1){root=i;break;}
		processForChildCount(root, tree);
		System.out.println(removedCount);
	}
	
	private static int processForChildCount(Integer node,Map<Integer,List<Integer>> tree){
		List<Integer> childs = null;
		if((childs=tree.get(node))==null || childs.size()==0){
			return 1;
		}else{
			int retVal = 0;
			for(Integer child : childs){
				int currChildRet = processForChildCount(child,tree);
				if(currChildRet%2==0){
					removedCount++;
				}
				else{
					retVal+=currChildRet;
				}
			}
			return ++retVal;
		}
	}
	
}


*/