package queue;

public class QueuePractice {
	int CAPACITY;
	int front,rear,length;
	int queue[];
	public static void main(String arg[])
	{
		QueuePractice qp = new QueuePractice();
		qp.createQueue(10);
		qp.dequeue();
		for(int i=1;i<=10;i++)
			qp.enqueue(i*10);
		System.out.println(qp.length);
		qp.displayQueue();
		qp.dequeue();
		qp.dequeue();
		qp.dequeue();
		qp.dequeue();
		int value=qp.dequeue();
		System.out.println("Value = "+value);
		qp.enqueue(11);
		qp.enqueue(12);
		qp.displayQueue();
	}
	
	public void createQueue(int capacity)
	{
		this.CAPACITY=capacity;
		this.front=this.length=0;
		this.rear=this.CAPACITY-1;
		this.queue =new int[this.CAPACITY];
	}
	
	
	
	void enqueue(int ele)
	{
		if(isQueueFull())
			System.out.println("Can't add queue is already full.");
		else
		{
			this.rear=(this.rear+1)%CAPACITY;
			queue[this.rear]=ele;
			this.length+=1;
		}
	}
	int dequeue()
	{
		if(isQueueEmpty())
		{
			System.out.println("Queue is Empty.");
			return Integer.MIN_VALUE;
		}
		else
		{
			int value=queue[front];
			this.front=(this.front+1)%this.CAPACITY;
			length=length-1;
			return value;
		}
	}
	void displayQueue()
	{
		if(isQueueEmpty())
			System.out.println("No element to display.");
		else
		{
			System.out.print("Elements: ");
			while(true)
			{
				System.out.print(this.queue[front]+" ");
				front=(front+1)%CAPACITY;
				if(front==(rear+1)%CAPACITY)
					break;
			}System.out.println();
		}
	}
	boolean isQueueEmpty()
	{
		return (this.length==0);
	}
	boolean isQueueFull()
	{
		return (this.length==this.CAPACITY);
	}
	
	
	
}
