package queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.Queue;
public class PriorityBlocking_Queue {
	public static void main(String[] args) {
	Queue<Integer> pbq=new PriorityBlockingQueue<>();
	pbq.add(20);
	pbq.add(10);
	System.out.println(pbq);
	pbq.add(15);
	System.out.println(pbq);
	System.out.println(pbq.peek());
	System.out.println(pbq.poll());
	System.out.println(pbq);
	System.out.println(pbq.remove());
	System.out.println(pbq);
	}
}
