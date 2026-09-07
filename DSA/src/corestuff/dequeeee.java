package corestuff;

import java.util.ArrayDeque;

public class dequeeee {
public static void main(String[] args) {
	ArrayDeque<Integer> arrayDeque=new ArrayDeque<Integer>();
	
	arrayDeque.offer(1);
	arrayDeque.offerFirst(2);
	arrayDeque.offerLast(3);
	arrayDeque.offerLast(4);
	System.out.println(arrayDeque);
	System.out.println(arrayDeque.peek());
	System.out.println(arrayDeque.peekLast());
	System.out.println(arrayDeque.peekFirst());
	
	System.out.println("\n"+arrayDeque.pollLast());
	System.out.println(arrayDeque);
	System.out.println("\n"+arrayDeque.pollFirst());
	System.out.println(arrayDeque);
	System.out.println("\n"+arrayDeque.poll());
	System.out.println(arrayDeque);
}
}
