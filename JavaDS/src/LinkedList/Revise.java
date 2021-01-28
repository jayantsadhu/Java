package LinkedList;

public class Revise {
	private Node head;
	
	private class Node
	{
		private int data;
		private Node next;
		
		public Node(int n)
		{
			this.data=n;
			next=null;
		}
	}
	
	public static void main(String arg[])
	{
		Revise r=new Revise();
		for(int i=1;i<=10;i++)
		{
			r.AddNode(9*i);
		}
		r.display();
		//System.out.println("\nLength= "+r.length());
		//r.middle();
		r.reverse();
		r.display();
	}
	
	public void AddNode(int data)
	{
		Node newnode,p;
		p=head;
		newnode=new Node(data);
		if (p==null)
			head=newnode;
		else
		{
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=newnode;
		}
	}
	
	public void display()
	{
		Node p=head;
		if(p==null)
			System.out.print("List is empty.");
		else
			while(p!=null)
			{
				System.out.print(p.data+"-->");
				p=p.next;
			}
		System.out.println();
	}
	public int length()
	{
		Node p=head;
		int i=0;
		while(p!=null)
		{
			i++;
			p=p.next;
		}
		return i;
	}
	public void middle()
	{
		Node p=head;
		int l=length()/2;
		for(int i=1;i<l;i++)
		{
			p=p.next;
		}
		if(length()%2!=0)
			System.out.println("Middle node is data = "+p.next.data+"   Address = "+p.next);
		else
			System.out.println("Middle node1 data= "+p.data+"   Address= "+p+"\nMiddle node2 data= "+p.next.data+"   Address= "+p.next);
	}
	
	public void reverse()
	{
		Node p=head;
		if(p==null)
			System.out.println("Empty list can't be reversed.");
		else
		{
			Node q=p.next,r=q.next;
			p.next=null;
			while(q!=null)
			{
				q.next=p;
				p=q;
				q=r;
				if(r!=null) r=r.next;	
			}
			head=p;
		}
		

}
}























