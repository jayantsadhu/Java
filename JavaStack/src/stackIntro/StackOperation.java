package stackIntro;
import java.util.EmptyStackException;
import java.util.Stack;
public class StackOperation {
	public static void main(String args[]) {
		Stack<Integer> stack=new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_search(stack,0);
		stack_peek(stack);
		System.out.println(stack);
	}
	
	static void stack_push(Stack<Integer> stack) {
		for(int i=1;i<=8;i++) {
			stack.push(i);
		}
	}
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("popped values: ");
		for(int i=1;i<=5;i++) {
			try{int poppedValue = stack.pop();
			System.out.print(poppedValue+" ");}
			catch(EmptyStackException e) {
				System.out.println();
			}
		}System.out.println("");
	}
	static void stack_peek(Stack<Integer> stack) {
		Integer element=stack.peek();
		System.out.println("Element on stack top: "+element);
	}
	static void stack_search(Stack<Integer> stack, Integer element) {
		int pos=stack.search(element);
		if(pos==-1)
			System.out.println("Element match not found.");
		else
			System.out.println("Element found at position: "+pos);
	}
	
}
