package com.SLL2;
import java.util.*;

public class SLL2 {

		private ListNode head;

		private static class ListNode
		{
			private int data;
			private ListNode next;
			
			public ListNode(int data)
			{
				this.data=data;
				this.next=null;
			}
		}
		
		public static void main(String[] args) {
			SLL2 sll=new SLL2();
			boolean b=true;
			while(b) {
			
			System.out.println("\nPls Choose an option:");
			System.out.println("1.Append.");
			System.out.println("2.Length.");
			System.out.println("3.Display.");
			System.out.println("4.Add node at beginning.");
			System.out.println("5.Reverse the loop. ");
			System.out.println("6.Remove duplicate data from sorted list. ");
			System.out.println("7.Delete the last node.");
			System.out.println("8.Insertion of a node in sorted list.");
			System.out.println("9.Sort the list.");
			System.out.println("10.Exit.");
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();	
			//sc.close();
			switch(n) {
				case 1:
					sll.Append();
					break;
				case 2:
					System.out.println("Length= "+sll.length());
					break;
				case 3:
					sll.display();
					break;
				case 4:
					sll.AddAtBeginning();
					break;
				case 5:
					sll.reverse();
					break;
				case 6:
					sll.removeDuplicateFromSorted();
				case 7:
					sll.DeleteLast();
					break;
				case 8:
					sll.insertionInSortedList();
					break;
				case 9:
					sll.sortList();
					break;
				case 10:
					b=false; //To exit the loop
					break;
				default :
					System.out.println("Invalid option.");	
			}
		}
		}
		
		public void display()
		{
			ListNode current=head;
			if(head==null)
				System.out.println("List is empty;");
			while(current!=null)
			{
				System.out.print(current.data+"-->");
				current=current.next;
			}
		}
		public int length()
		{
			ListNode current=head;
			int i=0;
			while(current!=null)
			{
				current=current.next;
				i++;
			}
			return i;
		}
		public void AddAtBeginning()
		{
			Scanner sc=new Scanner(System.in);
			int data=sc.nextInt();
			ListNode NewNode=new ListNode(data);
			NewNode.next=head;
			head=NewNode;
		}
		
		public void Append()
		{
			System.out.println("Enter data for the node: ");
			Scanner sc=new Scanner(System.in);
			int data=sc.nextInt();
			ListNode NewNode=new ListNode(data);
			ListNode p=head;
			if(p==null)
				head=NewNode;
			else
			{
			while(p.next!=null)
				p=p.next;
			p.next=NewNode;
			}
		}
		public void DeleteFirst()
		{
			if(head==null)
				System.out.println("No nodes to delete.");
			else
				{
				ListNode p=head.next;
				head.next=null;
				head=p;
				}
		}
		public void DeleteLast()
		{
			ListNode p=head;
			if(p==null)
				System.out.println("No node to delete.");
			else if(p.next==null)
				head=null;
			else {
			while(p.next.next!=null)
				p=p.next;
			p.next=null;
			}
		}
		public void Search()
		{
			System.out.println("Enter data want to search: ");
			Scanner sc=new Scanner(System.in);
			int key=sc.nextInt();
			ListNode p=head;
			int j=0;
			for(int i=1;p!=null;i++)
				{
				if(p.data==key)
					{
						System.out.println("Data available at "+i+"th node.");
						j++;
					}
				p=p.next;
				}
			if(j==0)
				System.out.println("Data is not available.");
		}
		/*public void reverse() {
			ListNode p=null,q=head,r=q.next;
			while(true) {
				q.next=p;
				p=q;
				q=r;
				if(r!=null) r=r.next;
				else break;
			} head=p;
		}*/
		
		public void reverse() {
			ListNode p=null,q=head,r=null;
			while(q!=null) {
				r=q.next;
				q.next=p;
				p=q;
				q=r;
			} head=p;
		}
		
		void sortList() {
			ListNode p=head,q=null,r=null;
			if(p.data>p.next.data) {
				q=p.next;
				p.next=q.next;
				q.next=p;
				head=q;
				p=head;
			}for(int i=1;i<=10;i++) {
				while(p.next.next!=null) {
					q=p.next;
					r=q.next;
					if(q.data>r.data) {
						q.next=r.next;
						r.next=q;
						p.next=r;
					}p=p.next;
				}
				p=head;
			}
		}
		
		void removeDuplicateFromSorted() {
			ListNode p=head,q=null;
			while(p!=null && p.next!=null) {
				if(p.data==p.next.data) {
					//q=p.next;
					p.next=p.next.next;
					//q.next=null;
				}
				else p=p.next;
			}
		}
		
		void insertionInSortedList() {
			ListNode current=head,temp=null;
			System.out.println("Enter data for new Node: ");
			int data=new Scanner(System.in).nextInt();
			ListNode newNode=new ListNode(data);
			while(current!=null && current.data<newNode.data) {
				temp=current;
				current=current.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}

