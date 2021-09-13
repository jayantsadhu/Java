package queue;
import java.util.PriorityQueue;
import java.util.Queue;
public class Priority_Queue {
	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		for(int i=3;i>0;i--) {
			pq.add(i);
		}
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.peek());
		pq.remove();
		int item=pq.remove();
		System.out.println(item+" "+pq);
		Queue<String> pq2=new PriorityQueue<>();
		
		pq2.add("Yellow");
		pq2.add("Saint");
		pq2.add("Play");
		System.out.println(pq2);
		pq2.remove();
		System.out.println(pq2);
	}
}
