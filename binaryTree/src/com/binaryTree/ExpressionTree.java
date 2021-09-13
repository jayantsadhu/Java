package com.binaryTree;
import java.util.Stack;
//postfix expression to infix order (inorder) binary tree
public class ExpressionTree {
	
	public static void main(String[] args)
	{
		String expression = "ab+ef*g*-";
		ExpressionTree ext = new ExpressionTree();
		Node root = ext.constructTree(expression);
		ext.inorder(root);
		
	}
	Node constructTree(String postfixExpression)
	{
		char[] postfix = postfixExpression.toCharArray();
		Node t=null;
		Stack<Node> stack = new Stack<Node>();
		for(int i=0; i<postfix.length;i++)
		{
			if(!isOperator(postfix[i]))
			{
				t = new Node(postfix[i]);
				stack.push(t);
			}
			else
			{
				Node tr = stack.pop();
				Node tl = stack.pop();
				t = new Node(postfix[i]);
				t.right = tr;
				t.left = tl;
				stack.push(t);
			}
		}
		return t;
	}
	
	boolean isOperator(char ch)
	{
		if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			return true;
		return false;
	}
	
	void inorder(Node root)
	{
		if(root==null)
			return;
		else
		{
			inorder(root.left);
			System.out.print(root.item);
			inorder(root.right);
		}
	}
	
}

class Node
{
	Node left,right;
	char item;
	
	Node(char item)
	{
		this.item=item;
		left = right = null;
	}
}