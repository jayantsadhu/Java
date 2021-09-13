package stackIntro;
import java.util.*;
public class InfixToPostfix2 {
	      
	    // A utility function to return 
	    // precedence of a given operator
	    // Higher returned value means 
	    // higher precedence
	    static int Prec(char ch)
	    {
	        switch (ch)
	        {
	        case '+':
	        case '-':
	            return 1;
	       
	        case '*':
	        case '/':
	            return 2;
	       
	        case '^':
	            return 3;
	        }
	        return -1;
	    }
	       
	    static String infixToPostfix(String exp)
	    {
	        String result = new String("");
	          
	        Stack<Character> stack = new Stack<>();
	          
	        for (int i = 0; i<exp.length(); ++i)
	        {
	            char c = exp.charAt(i);
	              
	            if (Character.isLetterOrDigit(c))
	                result += c;
	               
	            else if (c == '(')
	                stack.push(c);
	              
	            else if (c == ')')
	            {
	                while (!stack.isEmpty() && 
	                        stack.peek() != '(')
	                    result += stack.pop();
	                  
	                    stack.pop();
	            }
	            else 
	            {
	                while (!stack.isEmpty() && Prec(c) 
	                         <= Prec(stack.peek())){
	                    
	                    result += stack.pop();
	             }
	                stack.push(c);
	            }
	       
	        }
	       
	        // pop all the operators from the stack
	        while (!stack.isEmpty()){
	            if(stack.peek() == '(')
	                return "Invalid Expression";
	            result += stack.pop();
	         }
	        return result;
	    }
	    
	    // Driver method 
	    public static void main(String[] args) 
	    {
	        String exp = "a+b*(c^d-e)^(f+g*h)-i";
	        System.out.println(infixToPostfix(exp));
	    }
	}
