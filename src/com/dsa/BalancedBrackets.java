package com.dsa;
//Java program for checking
//balanced brackets
import java.util.*;

public class BalancedBrackets {

 // function to check if brackets are balanced
 static boolean areBracketsBalanced(String expr)
 {
     // Using ArrayDeque is faster than using Stack class
     Deque<Character> stack
         = new ArrayDeque<Character>();
     
     Deque<Character> stack1 = new ArrayDeque<Character>();
		for (int j = 0; j < expr.length(); j++) {
			char y = expr.charAt(j);

			if (y == '(' || y == '[' || y == '{') {
				stack1.push(y);
				continue;
			}
			if (stack1.isEmpty())
				return false;

			char check1;
			switch (y) {

			case ')':
				check1 = stack1.pop();
				if (check1 == '{' || check1 == '[')
					return false;
				break;
			case ']':
				check1 = stack1.pop();
				if (check1 == '{' || check1 == '(')
					return false;
				break;
			case '}':
				check1 = stack1.pop();
				if (check1 == '(' || check1 == '[')
					return false;
				break;
			}
		}
     

     // Traversing the Expression
//		for (int i = 0; i < expr.length(); i++) {
//			char x = expr.charAt(i);
//
//			if (x == '(' || x == '[' || x == '{') {
//				// Push the element in the stack
//				stack.push(x);
//				continue;
//			}
//
//			// If current character is not opening
//			// bracket, then it must be closing. So stack
//			// cannot be empty at this point.
//			if (stack.isEmpty())
//				return false;
//			char check;
//			switch (x) {
//			case ')':
//				check = stack.pop();
//				if (check == '{' || check == '[')
//					return false;
//				break;
//
//			case '}':
//				check = stack.pop();
//				if (check == '(' || check == '[')
//					return false;
//				break;
//
//			case ']':
//				check = stack.pop();
//				if (check == '(' || check == '{')
//					return false;
//				break;
//			}
//		}

     // Check Empty Stack
     return (stack.isEmpty());
 }

 // Driver code
 public static void main(String[] args)
 {
     String expr = "([{}])";
    // String expr1 = "([]){}";

     // Function call
     if (areBracketsBalanced(expr))
         System.out.println("Balanced ");
     else
         System.out.println("Not Balanced ");
 }
}
