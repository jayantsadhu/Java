package One;

import java.util.Scanner;

public class SLinkedList2 {

		
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
		
		SLinkedList2 sll=new SLinkedList2();
		
		System.out.println("Pls Choose an option:");
		System.out.println("1.Add Nodes.");
		System.out.println("2.Length.");
		System.out.println("3.Display.");
		System.out.println("4.Add node at beginning.");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
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
			default :
				System.out.println("Invalid option.");	
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

}

