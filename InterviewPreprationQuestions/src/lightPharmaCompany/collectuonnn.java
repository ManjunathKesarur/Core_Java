package lightPharmaCompany;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class collectuonnn {
public static void main(String[] args) {
	
//	List<Integer> list=new ArrayList<Integer>();
	
	Queue<Integer> list=new ArrayDeque<>();
	
	list.add(103);list.offer(10); list.offer(12); list.offer(100);
	
	System.out.print(list);
}
}
