package recursion;

public class st_op {
int[] stack;
int tstack=-1;
st_op(int size){
	stack = new int[size];
}
public boolean isempty() {
	return tstack==-1;
}
public boolean isfull() {
	return tstack==stack.length-1;
}
public void push(int value) {
	if(isfull()) {
		System.out.println("stack is full : ");
	}
	else {
		stack[++tstack]=value;
		System.out.println("inserted");
	}
}
public void pop() {
	if(isempty()) {
		System.out.println("sack is empty");
	}
	else {
		int v=stack[tstack];
		tstack--;
		System.out.println("the value"+v+"got deleted");
	}
}
public void peek() {
	if(isempty()) {
		System.out.println("the stack is empty");
	}else {
		System.out.println(stack[tstack]);
	}
}
public void delete() {
	stack=null;
	System.out.println("stack is destroyed ");
}
public static void main(String[] args) {
	st_op s=new st_op(10);
	s.push(19);
	s.push(10);
	s.peek();
	s.pop();
	s.pop();
	s.pop();
	s.push(112);
	s.push(12);
	s.isempty();
	s.pop();
	s.push(909);
	s.pop();
	s.pop();
}

}
