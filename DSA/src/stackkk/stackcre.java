package stackkk;

public class stackcre{

	int [] arr;
	int top =-1;
	int capacity;
	
	
	public stackcre( int capacity) {
		super();
		this.arr = new int[capacity];
		this.capacity = capacity;
	}


	public void push(int value) {
		if(top==capacity-1) {
			System.out.println("overflow");
		}else {
			top++;
			arr[top]=value;
		}
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("underflow");
		return -1;
		}
		int value =arr[top];
		return value;
	}
	
	public void display() {
		
		if(top == -1) {
			System.out.println("stack is empty");
			return;
		}
		
		for (int i=top; i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
