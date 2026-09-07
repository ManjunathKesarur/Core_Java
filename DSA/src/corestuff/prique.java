package corestuff;

import java.util.Comparator;
import java.util.PriorityQueue;

public class prique {
public static void main(String[] args) {
	PriorityQueue<Integer>priorityQueue=new PriorityQueue<Integer>(Comparator.reverseOrder());
	priorityQueue.offer(122);
	priorityQueue.offer(121);
	priorityQueue.offer(100000);
	priorityQueue.offer(9101);
	
	System.out.println(priorityQueue);
	
System.out.println(	priorityQueue.peek());

priorityQueue.poll();
System.out.println(priorityQueue);
}
}
