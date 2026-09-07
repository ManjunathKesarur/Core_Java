package corestuff;

import java.util.LinkedList;
import java.util.Queue;

public class linkedlistuu {
public static void main(String[] args) {

	Queue<Integer> queue = new LinkedList<Integer>();
queue.offer(121);
queue.offer(9101);
//queue.poll();
System.out.println(queue);

System.out.println(queue.peek());
}
}
