package stackIntro;
import java.util.Stack;
public class InfixToPostfix {
	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));	
	}
	
	static int prec(char ch) {
		switch(ch) {
		case '+' :
		case '-' :
			return 1;
		case '*' :
		case '/' :
			return 2;
		case '^' :
			return 3;
		}
		return -1;
	}
	
	static String infixToPostfix(String exp) {
		String output= "";
		Stack<Character> stack= new Stack<Character>();
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			if(Character.isLetterOrDigit(c))
				output+=c;
			else if(c=='(')
				stack.push(c);
			else if (c==')') {
				while(!stack.isEmpty() && stack.peek()!='(')
					output+=stack.pop();
				stack.pop();
			}
			else {
				while(!stack.isEmpty()  && prec(c)<=prec(stack.peek()))
					output+=stack.pop();
				stack.push(c);
			}
		}
		while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            output += stack.pop();
         }
		return output;
	}
}
