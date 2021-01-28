package One;

//import One.SinglyLinkedList.ListNode;

public class SLL3 {
	
	private LinkedList head;
	
	
	
	private static class LinkedList
	{
		private int data;
		private LinkedList next;
		
		public LinkedList(int data1)
		{
			this.data=data1;
			this.next=null;
		}
	}
	
	
	public static void main(String[] arg)
	{
		SLL3 sll=new SLL3();
		sll.head=new LinkedList(10);
		LinkedList second=new LinkedList(11);
		LinkedList third=new LinkedList(12);
		LinkedList fourth=new LinkedList(13);
		sll.head.next = second; //10-->11
		second.next=third;  //10-->11-->12
		third.next=fourth;  //10-->11-->12-->13
		
		sll.display();
		sll.Reverse();
		sll.display();
	}
	
	public void display()
	{
		LinkedList p=head;
		while(p!=null)
		{
			System.out.print(p.data+"-->");
			p=p.next;
		}
		System.out.println();
	}
	
	public void Reverse()
	{
		LinkedList p=null,q=head,r=null;
		if(q==null)
			System.out.println("Empty List.");
		
		while(q!=null)
		{
			r=q.next;
			q.next=p;
			p=q;
			q=r;
			
		}
		head=p;
	}
	

}
