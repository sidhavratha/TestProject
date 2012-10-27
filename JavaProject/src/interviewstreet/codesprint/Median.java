package interviewstreet.codesprint;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Median {

	public static void main(String[] args)throws Exception{
		
		
		//Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(new java.io.File("input_median.txt"));
		int N = scanner.nextInt();
		scanner.nextLine();
		HeightTree tree = new HeightTree();
		
		for(int i=0;i<N;i++){
			String nextLine = scanner.nextLine();
			//System.out.println("Current line : "+nextLine);
			StringTokenizer st = new StringTokenizer(nextLine," ");
			String action = st.nextToken();
			int value = Integer.parseInt(st.nextToken());
			if(action.equalsIgnoreCase("a")){
				tree.insert(value);
				
				double median = tree.median();
				
				if((int)median==median){
					System.out.println((int)median);	
				}else{
					System.out.println(median);
				}
			}else if(action.equalsIgnoreCase("r")){
				if(tree.delete(value)){
					double median = tree.median();
					if(median<0){
						System.out.println("Wrong!");
					}else{
						if((int)median==median){
							System.out.println((int)median);	
						}else{
							System.out.println(median);
						}
					}
				}else{
					System.out.println("Wrong!");
				}
			}
		}
		
		
	}
	
	
	static class HeightNode{
		HeightNode left;
		int leftHeight;
		HeightNode right;
		int rightHeight;
		int value;
		HeightNode parent;
		public HeightNode(int value){
			this.value=value;
		}
	}
	
	static class HeightTree{
		HeightNode root;
		
		double median(){
			if(root==null){
				return -1;
			}
			if(root.leftHeight==root.rightHeight){
				return root.value;
			}else if(root.leftHeight>root.rightHeight){
				 return (root.value+root.left.value)/2.0;
			}else{
				return (root.value+root.right.value)/2.0;
			}
		}
		
		HeightNode insert(int n){
			HeightNode node =  new HeightNode(n);
			insert(root,node);
			
			//balancing logic
			
			if(root.leftHeight-root.rightHeight > 1){
				HeightNode temp=root;
				HeightNode rootLeft = root.left;
				HeightNode newRoot = rightesht(root.left);
				
				if(newRoot!=rootLeft){
					newRoot.parent.right=newRoot.left;
					if(newRoot.left!=null){
						newRoot.left.parent=newRoot.parent;
					}
					//decrease each parents rightheight
					HeightNode parent = newRoot.parent;
					while(parent!=null){
						parent.rightHeight--;
						parent=parent.parent;
					}
					
					
					newRoot.left=rootLeft;
					rootLeft.parent=newRoot;
					newRoot.leftHeight=(rootLeft!=null?rootLeft.leftHeight+rootLeft.rightHeight:0)+1;
				}
				
				newRoot.right=temp;
				temp.parent=newRoot;
				temp.left=null;
				temp.leftHeight=0;
				temp.rightHeight=(temp.right!=null?temp.right.leftHeight+temp.right.rightHeight:0)+1;
				
				root=newRoot;
				newRoot.parent=null;
				root.leftHeight=(root.left!=null?root.left.leftHeight+root.left.rightHeight:0)+1;
				root.rightHeight=(root.right!=null?root.right.leftHeight+root.right.rightHeight:0)+1;
				
			}else if(root.rightHeight-root.leftHeight > 1){
				HeightNode temp=root;
				HeightNode rootRight = root.right;
				HeightNode newRoot = leftesht(root.right);
				
				if(newRoot!=rootRight){
					newRoot.parent.left=newRoot.right;
					if(newRoot.right!=null){
						newRoot.right.parent=newRoot.parent;
					}
					//decrease each parents rightheight
					HeightNode parent = newRoot.parent;
					while(parent!=null){
						parent.leftHeight--;
						parent=parent.parent;
					}
					
					
					
					newRoot.right=rootRight;
					rootRight.parent=newRoot;
					newRoot.rightHeight=(rootRight!=null?rootRight.leftHeight+rootRight.rightHeight:0)+1;
				}
				
				newRoot.left=temp;
				temp.parent=newRoot;
				temp.right=null;
				temp.rightHeight=0;
				temp.leftHeight=(temp.left!=null?temp.left.leftHeight+temp.left.rightHeight:0)+1;
				
				root=newRoot;
				newRoot.parent=null;
				root.leftHeight=(root.left!=null?root.left.leftHeight+root.left.rightHeight:0)+1;
				root.rightHeight=(root.right!=null?root.right.leftHeight+root.right.rightHeight:0)+1;
				
				
			}else{
				//root is balanced
			}
			
			return root;
		}
		
		HeightNode rightesht(HeightNode root){
			if(root.right==null) return root;
			return rightesht(root.right);
		}
		
		HeightNode leftesht(HeightNode root){
			if(root.left==null) return root;
			return leftesht(root.left);
		}
		
		void insert(HeightNode root,HeightNode node){
			if(root==null) this.root = node;
			else{
				if(root.value>=node.value){
					if(root.left==null){
						root.left=node;
						node.parent=root;
					}
					else insert(root.left,node);
					root.leftHeight++;
				}else{
					if(root.right==null){
						root.right=node;
						node.parent=root;
					}
					else insert(root.right,node);
					root.rightHeight++;
				}
			}
		}
		
		boolean delete(int n){
			return delete(root,n);
		}
		
		boolean delete(HeightNode root,int n){
			
			if(root==null) return false;
			if(root.value==n){
				HeightNode removeNode = root;
				HeightNode removeNodeParent = root.parent;
				
				HeightNode pointer = (removeNode.left==null)?removeNode.right:removeNode.left; 
				
				if(removeNodeParent!=null){
					if(removeNodeParent.left==removeNode){
						removeNodeParent.left=pointer;
						
					}else{
						removeNodeParent.right=pointer;
						
					}
				}else{
					this.root=pointer;
				}
				
				if(pointer==null){
					return true;
				}else{
					pointer.parent=removeNodeParent;
				}
				
				if(removeNode.left!=null && removeNode.right!=null){
					HeightNode rightMostChild = rightesht(removeNode.left);
					rightMostChild.right=removeNode.right;
					if(removeNode.right!=null){
						removeNode.right.parent=rightMostChild;
					}
					rightMostChild.rightHeight=(removeNode.right!=null?removeNode.right.leftHeight+removeNode.right.rightHeight:0)+1;
				}
				
				return true;
			}else if(root.value<n){
				if(delete(root.right,n)){
					root.rightHeight--;
					return true;
				}else{
					return false;
				}
				
			}else{
				if(delete(root.left,n)){
					root.leftHeight--;
					return true;
				}else{
					return false;
				}
			}
		}
	}
	

}
