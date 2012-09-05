package techgig.quiz;

import java.util.ArrayList;
import java.util.List;

public class InsertElement {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add((Integer)9);
		System.out.println(list.remove((Integer)6));
		
		/*Node insert = new Node();
		insert.data=5;
		printList(prepareCase1());
		printList(addElement(prepareCase1(), insert));
		
		printList(prepareCase2());
		printList(addElement(prepareCase2(), insert));
		
		printList(prepareCase3());
		printList(addElement(prepareCase3(), insert));
		printList(prepareCase4());
		printList(addElement(prepareCase4()));*/

	}
	
	public static Node prepareCase1(){
		Node n1 = new Node();
		n1.data=2;
		Node n2 = new Node();
		n2.data=6;
		n1.next=n2;
		n2.next=n1;
		return n1;
	}
	
	public static native void aMethod();
	
	
	public static Node prepareCase2(){
		Node n1 = new Node();
		n1.data=9;
		Node n2 = new Node();
		n2.data=10;
		Node n3 = new Node();
		n3.data=11;
		Node n4 = new Node();
		n4.data=7;
		Node n5 = new Node();
		n5.data=8;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		
		
		
		return n1;
	}
	

	public static Node prepareCase3(){
		Node n1 = new Node();
		n1.data=9;
		Node n2 = new Node();
		n2.data=10;
		Node n3 = new Node();
		n3.data=11;
		Node n4 = new Node();
		n4.data=12;
		Node n5 = new Node();
		n5.data=13;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		
		
		
		return n1;
	}
	
	public static Node prepareCase4(){
		Node n1 = new Node();
		n1.data=2;
		Node n2 = new Node();
		n2.data=3;
		Node n3 = new Node();
		n3.data=4;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n1;
		
		
		
		return n1;
	}
	
	
	
	
	public static void printList(Node input1){
		Node node=input1;
		do{
			System.out.print(node.data+"->");
			node=node.next;
		}while(node!=input1);
		System.out.println();
	}
	
	public static Node addElement(Node input1,Node insert){
		Node node=input1;
		do{
			if(node.data>insert.data){
				if(node.next.data>node.data){
					node=node.next;
					continue;
				}
				else if(node.next.data<node.data){
					
					if(node.next.data<insert.data){
						node=node.next;
						continue;
					}
					Node temp=node.next;
					node.next = insert;
					node.next.next = temp;
					break;
				}
				else{
					//handle it later (node.next.value = node.value)
					if(node.next==input1){
						Node temp=node.next;
						node.next = insert;
						node.next.next = temp;
						break;
					}
					node=node.next;
					continue;
				}
			}
			else if(node.data<insert.data){
				if(node.next.data>=node.data){
					if(node.next.data >= insert.data){
						Node temp=node.next;
						node.next = insert;
						node.next.next = temp;
						break;
					}
					else{
						if(node.next==input1){
							Node temp=node.next;
							node.next = insert;
							node.next.next = temp;
							break;
						}
						node=node.next;
						continue;
					}
				}
				else if(node.next.data<node.data){
					Node temp=node.next;
					node.next = insert;
					node.next.next = temp;
					break;
				}
			}
		}while(true);
		return input1;
	}
	
	
	public static Node addElement(Node input1){
		Node node=input1;
		Node insert = new Node();
		insert.data=5;
		insert.next=null;
		do{
			if(node.data>insert.data){
				if(node.next.data>node.data){
					node=node.next;
					continue;
				}
				else if(node.next.data<node.data){
					
					if(node.next.data<insert.data){
						node=node.next;
						continue;
					}
					Node temp=node.next;
					node.next = insert;
					node.next.next = temp;
					break;
				}
				else{
					//handle it later (node.next.value = node.value)
					if(node.next==input1){
						Node temp=node.next;
						node.next = insert;
						node.next.next = temp;
						break;
					}
					node=node.next;
					continue;
				}
			}
			else if(node.data<insert.data){
				if(node.next.data>=node.data){
					if(node.next.data >= insert.data){
						Node temp=node.next;
						node.next = insert;
						node.next.next = temp;
						break;
					}
					else{
						if(node.next==input1){
							Node temp=node.next;
							node.next = insert;
							node.next.next = temp;
							break;
						}
						node=node.next;
						continue;
					}
				}
				else if(node.next.data<node.data){
					Node temp=node.next;
					node.next = insert;
					node.next.next = temp;
					break;
				}
			}
		}while(true);
		return input1;
	}

}

class Node
{
    public int data;
    public Node next;
} 