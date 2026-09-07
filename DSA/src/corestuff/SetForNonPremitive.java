package corestuff;

import java.util.HashSet;
import java.util.Set;

public class SetForNonPremitive {
public static void main(String[] args) {
	Set<Student> students =new HashSet<Student>();
	
	students.add(new Student("charlie",1));
	students.add(new Student("isac",2));
	students.add(new Student("charles",2));
	
	System.out.println(students);
}
}
