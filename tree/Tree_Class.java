package tree;

public class Tree_Class {

	private Node root;

	void create_Tree() {
		root = null;
	}

	void insert(Node r, Node n)// in bst manner
	//r is root , n is new node
	{
		if (root == null)
			root = n;
		else {
			if (n.data < r.data)// if less to left
			{
				if (r.left == null)// empty left
				{
					r.left = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.left, n);// recursion call
			} else// if equal or greater than to right
			{
				if (r.right == null)// empty left
				{
					r.right = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.right, n);// recursion call
			}
		}
	}

	void inorder(Node r) {
		if (r != null) {// LPR
			inorder(r.left);// L
			System.out.print(r.data + ",");// P
			inorder(r.right);// L
		}
	}

	void preorder(Node r) {
		if (r != null) {// PLR
			System.out.print(r.data + ",");// P
			preorder(r.left);// L
			preorder(r.right);// L
		}
	}

	void postorder(Node r) {
		if (r != null) {// LRP
			preorder(r.left);// L
			preorder(r.right);// L
			System.out.print(r.data + ",");// P
		}
	}

	public Node getRoot() {
		return root;
	}

	public static void main(String args[]) {
		Tree_Class obj = new Tree_Class();
		obj.create_Tree();
		Node x = new Node(10);
		obj.insert(obj.root, new Node(10));
		obj.insert(obj.root, new Node(30));
		obj.insert(obj.root, new Node(20));
		obj.insert(obj.root, new Node(5));
		obj.insert(obj.root, new Node(15));
		
		System.out.println("---------------Inorder---------------");
		obj.inorder(obj.root);
		System.out.println();
		System.out.println("--------------Preorder-----------------");
		obj.preorder(obj.root);
		System.out.println();
		System.out.println("--------------PostOrder---------------");
		obj.postorder(obj.root);
	}

}
