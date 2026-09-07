package corestuff;

import java.util.Stack;

public class collecstack {
public static void main(String[] args) {
	Stack<String> stack=new Stack<String>();
	stack.push("dad");
	stack.push("son");
	stack.push("mom");
	
	System.out.println(stack);
	System.out.println(stack.peek());
	
	stack.pop(); 
	System.out.println(stack);

}
}
