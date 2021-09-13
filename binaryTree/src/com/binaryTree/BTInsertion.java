package com.binaryTree;
import java.util.*;
public class BTInsertion {
	private BTNode root=null;
	
	private class BTNode 
	{
		private BTNode left;
		int data;
		private BTNode right;
		
		private BTNode(int data)
		{
			this.left=this.right=null;
			this.data=data;
		}
	}
	void insert(int data)
	{
		BTNode temp = root;
		BTNode newNode =new  BTNode(data);
		if(temp==null)
		{
			root = newNode;
			return;
		}
		
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(temp);
		while(!q.isEmpty())
		{
			temp = q.poll();
			
			if(temp.left==null)
			{
				temp.left = newNode;
				break;
			}
			else
				q.add(temp.left);
			if(temp.right==null)
			{
				temp.right = newNode;
				break;
			}
			else
				q.add(temp.right);
		}
	}
	void delNode()
	{
		if(root==null)
			return;
		if(root.left==null && root.right==null)
		{
			root=null;
			return;
		}
		BTNode temp = null;
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);
		while(!q.isEmpty())
		{
			temp = q.poll();
			
			if(temp.left!=null)
				q.add(temp.left);
			
			if(temp.right!=null)
				q.add(temp.right);
		}
		
		BTNode temp1 = null;
		q.add(root);
		while(!q.isEmpty())
		{
			temp1 = q.poll();
			
			if(temp1.left==temp)
			{
				temp1.left = null;
				return;
			}
			else
				q.add(temp1.left);
			
			if(temp1.right==temp)
			{
				temp1.right = null;
				return;
			}
			else
				q.add(temp1.right);
		}
		
	}
	
	void inorder_traverse(BTNode root)
	{
		if(root==null)
			return;
		
		inorder_traverse(root.left);
		System.out.print(root.data+" ");
		inorder_traverse(root.right);
	}
	
	public static void main(String[] args)
	{
		BTInsertion bni = new BTInsertion();
		bni.insert(4);
		bni.insert(2);
		bni.insert(6);
		bni.insert(1);
		bni.insert(3);
		bni.insert(5);
		bni.insert(7);
		bni.insert(8);
		bni.insert(9);
		bni.insert(10);
		bni.delNode();
		bni.inorder_traverse(bni.root);
	}
}


