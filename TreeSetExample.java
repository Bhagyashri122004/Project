package Demo;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet to store Integer values
        TreeSet<Integer> numbers = new TreeSet<>();

        // Inserting values into the TreeSet
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

       
        // Printing the TreeSet (values will be in sorted order)
        System.out.println("TreeSet values (sorted): " + numbers);
    }
}

/* output:-
TreeSet values (sorted): [10, 20, 30, 40, 50]
*/