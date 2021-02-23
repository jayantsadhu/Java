package LinkedList;
import java.util.Scanner;
public class Practice2 {
		
		private NodeList head;
		
		private class NodeList {
			private int data;
			private NodeList next;
			
			//private NodeList() {}
			private NodeList(int data) {
				this.data=data;
				this.next=null;
			}
		}
		
		public static void main(String[] args) {
			boolean b=true;
			Practice2 pr2=new Practice2();
			while(b) {
				System.out.println("\nChoose an option:-------------------------------------->");
				System.out.println("1. Append.");
				System.out.println("2. Display.");
				System.out.println("3. Nth node form last.");
				System.out.println("4. Exit.");
				
				Scanner sc =new Scanner(System.in);
				
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter data for it.");
					pr2.append(sc.nextInt());
					break;
				case 2:
					pr2.display();
					break;
				case 3:
					System.out.println(pr2.nthNodeFromLast(sc.nextInt()));
					break;
				case 4:
					b=false;
					break;
				default :
					System.out.println("Pls choose an valid option.");
				
				}
			}
			
		}
		//NodeList nl=new NodeList();
		void append(int data) {
			NodeList newNode=new NodeList(data);
			NodeList refNode=head;
			if(refNode==null)
				head=newNode;
			else {
				while(refNode.next!=null)
					refNode=refNode.next;
				refNode.next=newNode;
			}
			
		}
		void display() {
			NodeList refNode=head;
			if(head==null)
				System.out.println("Nodelist is empty.");
			else {
				System.out.println("Node List is: ");
				while(refNode!=null) {
					System.out.print("-->"+refNode.data);
					refNode=refNode.next;
				}
			}
		}
		int nthNodeFromLast(int n) {
			NodeList refNode=head;
			NodeList mainNode=head;
			for(int i=1;i<=n;i++)
				if(refNode!=null)
				refNode=refNode.next;
				else
					return 0;
			while(refNode!=null) {
				refNode=refNode.next;
				mainNode=mainNode.next;
			}
			return mainNode.data;
			
		}
		
		
	
}

