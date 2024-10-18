/*Write a program to read ‘n’ integers and store them in a Binary search tree and display the nodes level wise.*/
package Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Levelwise_Nodes {

	class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int key) {
			val = key;
			left = right = null;
		}
	}

	TreeNode root;

	void insert(int key) {
		root = insertRec(root, key);
	}

	TreeNode insertRec(TreeNode node, int key) {
		if (node == null) {
			node = new TreeNode(key);
			return node;
		}
		if (key < node.val) {
			node.left = insertRec(node.left, key);
		} else {
			node.right = insertRec(node.right, key);
		}
		return node;
	}

	void levelOrder() {
		if (root == null)
			return;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			for (int i = 0; i < levelSize; i++) {
				TreeNode node = queue.poll();
				System.out.print(node.val + " ");
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			System.out.println(); // New line for the next level
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Levelwise_Nodes bst = new Levelwise_Nodes();

		System.out.print("Enter the number of integers to insert: ");
		int n = scanner.nextInt();

		System.out.println("Enter the integers:");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			bst.insert(num);
		}

		System.out.println("\nLevel-wise display of the BST:");
		bst.levelOrder();

		scanner.close();
	}
}
