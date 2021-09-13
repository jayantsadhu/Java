package BinaryTrees;

public class BinaryTree 
{
	public static void main(String[] args)
	{
		Node node = new Node();
		node.root = new Node(10);
		node.root.left = new Node(20);
		node.root.right = new Node(30);
		node.root.left.left = new Node(40);
		node.root.left.right = new Node(50);
		node.root.right.left = new Node(60);
		node.root.right.right = new Node(70);
	}
}

class Node
{
	Node root;
	int data;
	Node left, right;
	
	Node(){}
	Node(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}
}
