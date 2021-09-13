package queue;

class Queue {
	int front,rear,size;
	int CAPACITY;
	int array[];
	public Queue(int capacity) {
		this.CAPACITY=capacity;
		this.front=this.size=0;
		this.rear=this.CAPACITY-1;
		this.array=new int[this.CAPACITY];
		
	}
	boolean isEmpty() {
		return (this.size==0);
	}
	boolean isFull() {
		return (this.size==this.CAPACITY);
	}
	void enqueue(int ele) {
		if(isFull()) {
			System.out.println("Queue is in overflow.");
			return;
		}
		this.rear=(this.rear+1) % this.CAPACITY;
		this.array[this.rear]=ele;
		this.size++;
		
	}
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Underflow condtion.");
			return Integer.MIN_VALUE;
		}
		int item=this.array[this.front];
		this.front=(this.front+1) % this.CAPACITY;
		this.size--;
		return item;
	}
	int front() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		return this.array[front];
	}
	int rear() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		return this.array[rear];
	}
	void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return ;
		}
		if(this.front==this.rear) {
			System.out.println("["+this.array[this.front]+"]");
			return;
		}
		System.out.print("[ ");
		for(int i=this.front;true;i=(i+1)%this.CAPACITY) {
			System.out.print(this.array[i]+" ");
			if(i==this.rear) {
				System.out.print("]");
				break;
			}
		}
	}
}



public class ArrayQueue2 {
	public static void main(String[] args) {
		Queue queue=new Queue(5);
		System.out.println(queue.front+", "+queue.rear);
		System.out.println(queue.front());
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue.front+", "+queue.rear);
		queue.dequeue();
		queue.dequeue();
		//queue.dequeue();
		//queue.dequeue();
		queue.enqueue(60);
		queue.enqueue(70);
		System.out.println(queue.front+", "+queue.rear);
		queue.display();
		
	}
}
