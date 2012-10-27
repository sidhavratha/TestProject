package extra;


public class AVLTree {
	 
	 protected AvlNode root;
	 
	
	 public void insert(int k) {
		 AvlNode n = new AvlNode(k);
		 insertAVL(this.root,n);
	 }
	 
	 public void insertAVL(AvlNode p, AvlNode q) {
		 if(p==null) {
			 this.root=q;
		 } else {

			 if(q.key<p.key) {
				 if(p.left==null) {
					 p.left = q;
					 q.parent = p;

					 recursiveBalance(p);
				 } else {
					 insertAVL(p.left,q);
				 }

			 } else if(q.key>p.key) {
				 if(p.right==null) {
					 p.right = q;
					 q.parent = p;

					 recursiveBalance(p);
				 } else {
					 insertAVL(p.right,q);
				 }
			 } else {
				 // do nothing: This node already exists
			 }
		 }
	 }
	 
	 public void recursiveBalance(AvlNode cur) {

		 setBalance(cur);
		 int balance = cur.balance;

		 if(balance==-2) {

			 if(height(cur.left.left)>=height(cur.left.right)) {
				 cur = rotateRight(cur);
			 } else {
				 cur = doubleRotateLeftRight(cur);
			 }
		 } else if(balance==2) {
			 if(height(cur.right.right)>=height(cur.right.left)) {
				 cur = rotateLeft(cur);
			 } else {
				 cur = doubleRotateRightLeft(cur);
			 }
		 }

		 if(cur.parent!=null) {
			 recursiveBalance(cur.parent);
		 } else {
			 this.root = cur;
			 System.out.println("———— Balancing finished —————-");
		 }
	 }

	 public void remove(int k) {
		 removeAVL(this.root,k);
	 }
	 
	 public void removeAVL(AvlNode p,int q) {
		 if(p==null) {
			 return;
		 } else {
			 if(p.key>q)  {
				 removeAVL(p.left,q);
			 } else if(p.key<q) {
				 removeAVL(p.right,q);
			 } else if(p.key==q) {
				 removeFoundNode(p);
			 }
		 }
	 }
	 
	 public void removeFoundNode(AvlNode q) {
		 AvlNode r;
		 if(q.left==null || q.right==null) {
			 if(q.parent==null) {
				 this.root=null;
				 q=null;
				 return;
			 }
			 r = q;
		 } else {
			 r = successor(q);
			 q.key = r.key;
		 }

		 AvlNode p;
		 if(r.left!=null) {
			 p = r.left;
		 } else {
			 p = r.right;
		 }

		 if(p!=null) {
			 p.parent = r.parent;
		 }

		 if(r.parent==null) {
			 this.root = p;
		 } else {
			 if(r==r.parent.left) {
				 r.parent.left=p;
			 } else {
				 r.parent.right = p;
			 }
			 recursiveBalance(r.parent);
		 }
		 r = null;
	 }
	 
	 public AvlNode rotateLeft(AvlNode n) {

		 AvlNode v = n.right;
		 v.parent = n.parent;

		 n.right = v.left;

		 if(n.right!=null) {
			 n.right.parent=n;
		 }

		 v.left = n;
		 n.parent = v;

		 if(v.parent!=null) {
			 if(v.parent.right==n) {
				 v.parent.right = v;
			 } else if(v.parent.left==n) {
				 v.parent.left = v;
			 }
		 }

		 setBalance(n);
		 setBalance(v);

		 return v;
	 }
	 
	 public AvlNode rotateRight(AvlNode n) {

		 AvlNode v = n.left;
		 v.parent = n.parent;

		 n.left = v.right;

		 if(n.left!=null) {
			 n.left.parent=n;
		 }

		 v.right = n;
		 n.parent = v;


		 if(v.parent!=null) {
			 if(v.parent.right==n) {
				 v.parent.right = v;
			 } else if(v.parent.left==n) {
				 v.parent.left = v;
			 }
		 }

		 setBalance(n);
		 setBalance(v);

		 return v;
	 }

	 
	 public AvlNode doubleRotateLeftRight(AvlNode u) {
		 u.left = rotateLeft(u.left);
		 return rotateRight(u);
	 }

	 public AvlNode doubleRotateRightLeft(AvlNode u) {
		 u.right = rotateRight(u.right);
		 return rotateLeft(u);
	 }

	 public AvlNode successor(AvlNode q) {
		 if(q.right!=null) {
			 AvlNode r = q.right;
			 while(r.left!=null) {
				 r = r.left;
			 }
			 return r;
		 } else {
			 AvlNode p = q.parent;
			 while(p!=null && q==p.right) {
				 q = p;
				 p = q.parent;
			 }
			 return p;
		 }
	 }

	 private int height(AvlNode cur) {
		 if(cur==null) {
			 return -1;
		 }
		 if(cur.left==null && cur.right==null) {
			 return 0;
		 } else if(cur.left==null) {
			 return 1+height(cur.right);
		 } else if(cur.right==null) {
			 return 1+height(cur.left);
		 } else {
			 return 1+maximum(height(cur.left),height(cur.right));
		 }
	 }

	 private int maximum(int a, int b) {
		 if(a>=b) {
			 return a;
		 } else {
			 return b;
		 }
	 }

	 /*public void debug(AvlNode n) {
		 int l = 0;
		 int r = 0;
		 int p = 0;
		 if(n.left!=null) {
			 l = n.left.key;
		 }
		 if(n.right!=null) {
			 l = n.right.key;
		 }
		 if(n.parent!=null) {
			 p = n.parent.key;
		 }

		 System.out.println("Left: "+l+" Key: "+n+" Right: "+r+" Parent: "+p+" Balance: "+n.balance);

		 if(n.left!=null) {
			 debug(n.left);
		 }
		 if(n.right!=null) {
			 debug(n.right);
		 }
	 }
	  */
	 private void setBalance(AvlNode cur) {
		 cur.balance = height(cur.right)-height(cur.left);
	 }

	 /*final protected ArrayList<AvlNode> inorder() {
		 ArrayList<AvlNode> ret = new ArrayList<AvlNode>();
		 inorder(root, ret);
		 return ret;
	 }

	 final protected void inorder(AvlNode n, ArrayList<AvlNode> io) {
		 if (n == null) {
			 return;
		 }
		 inorder(n.left, io);
		 io.add(n);
		 inorder(n.right, io);
	 }*/
	 
	 static class AvlNode{
			AvlNode left;
			AvlNode right;
			AvlNode parent;
			int key;
			int balance;
			public AvlNode(int k){
				key=k;
			}
		}

}