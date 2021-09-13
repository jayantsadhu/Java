package problems;
//import java.util.*;
public class NumberFromLinkedList {
	private NodeList head;
	
	private class NodeList{
		private int data;
		private NodeList next;
		
		 private NodeList(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		NumberFromLinkedList nl1= new NumberFromLinkedList();
		NumberFromLinkedList nl2= new NumberFromLinkedList();
		NumberFromLinkedList nl3= new NumberFromLinkedList();
		
		int[] a= {7, 5, 8};
		int[] b= {3, 4, 6, 8, 1};
		for(int i=0;i<3;i++) {
		nl1.append(a[i]);
		nl2.append(b[i]);
		}
		nl2.append(b[3]);
		nl2.append(b[4]);
		
		int s1=nl1.ListToNumber();
		int s2=nl2.ListToNumber();
		nl1.display();
		nl2.display();
		int sum=s1+s2;
		nl3.NumbetToList(sum);
		nl3.display();
		
	}
	
	void append(int data) {
		NodeList newNode=new NodeList(data);
		NodeList ref=head;
		if(ref==null) 
			head=newNode;
		else {
			while(ref.next!=null)
				ref=ref.next;
			ref.next=newNode;
		}
	}
	
	void display() {
		NodeList ref=head;
		
		while(ref!=null) {
			System.out.print("-->"+ref.data);
			ref=ref.next;
		}System.out.println("");
	}
	
	int ListToNumber() {
		NodeList ref=head;
		int i=0;
		while(ref!=null) {
			i++;
			ref=ref.next;
		}
		ref=head;
		int s=0;
		while(ref!=null) {
			s=(int) (s+(ref.data) * (Math.pow(10, (i-1))));
			ref=ref.next;
			i--;
		}
		return s;
	}
	
	void NumbetToList(int s) {
		//NodeList ref=head;
		
		while(s!=0) {
			int r=s % 10;
			s=s/10;
			NodeList newNode= new NodeList(r);
			if(head==null)
				head=newNode;
			else {
				newNode.next=head;
				head=newNode;
			}
		}
	}
	
	/*int length(NodeList root) {
		NodeList ref=root;
		int l=0; 
		while(ref!=null) {
			ref=ref.next;
			l++;
		}
		return l;
	}
	
	int sumTwoLists(NodeList head1, NodeList head2) {
		//NodeList ref=head ;
		int j=Math.max(length(head1),length(head2));
		
		
		
	}*/
}


