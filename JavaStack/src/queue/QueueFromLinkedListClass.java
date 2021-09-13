package queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueFromLinkedListClass {
	public static void main(String[] arg) {
		Queue<Integer> q=new LinkedList<>();
		//for(int i=1;i<11;i++)
			//q.add(i);
		q.add(10);
		q.add(20);
		q.add(15);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());//doesn't throw exception when empty but returns null unlike remove()
		System.out.println(q);
		System.out.println(q.peek());
		int removedItem=q.remove();
		System.out.println(removedItem);
		q.remove();
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q);
		Queue<String> q2=new LinkedList<>();
		q2.add("Hello");
		q2.add("Jayant");
		boolean b=q2.add("Kumar");
		System.out.println(b+" "+q2);
	}
}
