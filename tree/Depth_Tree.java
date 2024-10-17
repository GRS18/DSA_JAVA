package tree;

public class Depth_Tree {

	private Node root;

	void create_Tree() {
		root = null;
	}

	void insert(Node r, Node n)// in bst manner
	// r is root , n is new node
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

	int depth(Node r) {
		if (r == null)
			return 0;
		else {
			int left = depth(r.left);
			int right = depth(r.right);
			return Math.max(left, right) + 1;
		}
	}

	Node get_root() {
		return root;
	}

	public static void main(String args[]) {
		Depth_Tree obj = new Depth_Tree();
		obj.create_Tree();
		Node x = new Node(10);
		obj.insert(obj.get_root(), new Node(50));
		obj.insert(obj.get_root(), new Node(30));
		obj.insert(obj.get_root(), new Node(100));
		obj.insert(obj.get_root(), new Node(5));
		obj.insert(obj.get_root(), new Node(45));
		obj.insert(obj.get_root(), new Node(200));

		System.out.println("\nDepth is:" + (obj.depth(obj.get_root()) - 1));
	}

}
