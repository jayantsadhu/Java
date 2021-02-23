package LinkedList;

class ListNode1
{
	ListNode1 head;
	int data;
	ListNode1 next;
	
	ListNode1() {}
	public ListNode1(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class Practice1 {
	
	public static void main(String[] args) {
		Practice1 pr1=new Practice1();
		ListNode1 ln1=new ListNode1();
		ln1.head=new ListNode1(10);
		ListNode1 second=new ListNode1(11);
		ListNode1 third=new ListNode1(12);
		ListNode1 fourth=new ListNode1(13);
		ln1.head.next = second; //10-->11
		second.next=third;  //10-->11-->12
		third.next=fourth;  //10-->11-->12-->13
		pr1.AddAtBeginning(ln1.head,9);
		pr1.display(ln1.head);
		System.out.print("\nLength= "+pr1.length(ln1.head));
	}
	
	public void display(ListNode1 head)
	{
		ListNode1 current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
	}
	public int length(ListNode1 head)
	{
		ListNode1 current=head;
		int i=0;
		while(current!=null)
		{
			current=current.next;
			i++;
		}
		return i;
	}
	public void AddAtBeginning(ListNode1 head, int data)
	{
		ListNode1 NewNode=new ListNode1(data);
		NewNode.next=head;
		head=NewNode;
	}
}




