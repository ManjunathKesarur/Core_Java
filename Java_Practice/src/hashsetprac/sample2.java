package hashsetprac;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sample2 {
    public static void main(String[] args) {

        HashSet r1 = new HashSet();

        r1.add(10);
        r1.add("Python");
        r1.add(20);
        r1.add(90.45);

        System.out.println(r1);

        System.out.println("Size: " + r1.size());

        System.out.println("Contains Java? " + r1.contains("Java"));

        r1.remove("C");
        System.out.println("After remove(): " + r1);

        System.out.println("Is empty? " + r1.isEmpty());

        HashSet r2 = new HashSet<>();
        r2.add("HTML");
        r2.add("CSS");

        r1.addAll(r2);
        System.out.println("After addAll(): " + r2);

        System.out.println("Contains all ref2 elements? " + r1.containsAll(r2));

        r1.removeAll(r2);
        System.out.println("After removeAll(): " + r2);

        Set<String> ref3 = new HashSet<>();
        ref3.add("Java");
        ref3.add("SQL");

        r1.retainAll(r2);
        System.out.println("After retainAll(): " + r1);

        Iterator<String> it = r1.iterator();
        System.out.println("Using iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        r2.clear();
        System.out.println("After clear(): " + r2);

        System.out.println("Is empty now? " + r2.isEmpty());
    }
}
