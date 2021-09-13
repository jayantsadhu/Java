package queue;

public class ArrayQueue {
	static int front=-1,rear=-1;
	public static void main(String[] args) {
		Integer[] array=new Integer[7];
		for(int i=1;i<=7;i++)
			enqueue(array,i);
		dequeue(array);
		dequeue(array);
		for(Object j:array)
			System.out.print(j+" ");
	}
	
	static Object[] enqueue(Object[] arr, Object obj) {
		if(front==-1) {
		arr[rear+1]=obj;
		rear++;front++;
		}
		else if(rear==arr.length-1) {
			System.out.println("Queue is in overflow.");
		}
		else {
			arr[rear+1]=obj;
			rear++;
		}
		return arr;
	}
	static Object[] dequeue(Object[] arr){
		if(front==-1)
			System.out.println("Queue is in underflow condition.");
		else {
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			arr[rear]=null;
			if(rear!=0)
				rear--;
			else {
				front--; rear--;
			}
		}
		return arr;
	}
}
