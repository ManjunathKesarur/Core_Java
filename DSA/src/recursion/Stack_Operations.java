package recursion;



	public class Stack_Operations {
	    int[] Stack;
	    int topOfStack = -1;

	    Stack_Operations(int size){
	        Stack = new int[size];
	    }

	    public boolean isEmpty() {
	        return topOfStack == -1;  
	    }

	    public boolean isFull() {
	        return topOfStack == Stack.length - 1;  
	    }

	    public void push(int value) {
	        if (isFull()) {
	            System.out.println("Stack is Full");
	        } else {
	            Stack[++topOfStack] = value;
	            System.out.println("Inserted: " + value);
	        }
	    }

	    public void pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	        } else {
	            int v = Stack[topOfStack];  
	            topOfStack--;
	            System.out.println("Deleted: " + v);
	        }
	    }

	    public void peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println("Top value: " + Stack[topOfStack]);
	        }
	    }
	    public static void main(String[] args) {

	        Stack_Operations stack = new Stack_Operations(5);

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.peek();   
	        stack.pop();    
	        stack.peek();   
	        stack.pop();
	        stack.pop();
	        stack.pop();    
	        stack.push(40);
	        stack.peek();
//	        stack.isFull();
	    }
	}

