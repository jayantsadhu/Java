package One;


public class SinglyLinkedList {
	
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
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(11);
		ListNode third=new ListNode(12);
		ListNode fourth=new ListNode(13);
		sll.head.next = second; //10-->11
		second.next=third;  //10-->11-->12
		third.next=fourth;  //10-->11-->12-->13
		sll.AddAtBeginning(9);
		sll.display();
		System.out.print("\nLength= "+sll.length());
	}
	
	public void display()
	{
		ListNode current=head;
		for(int i=1;current!=null;i++)
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
	public void AddAtBeginning(int data)
	{
		ListNode NewNode=new ListNode(data);
		NewNode.next=head;
		head=NewNode;
	}
	

}




