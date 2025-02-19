package Demo;

import java.util.ArrayDeque;
public class BookQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an ArrayDeque to store book names
        ArrayDeque<String> bookQueue = new ArrayDeque<>();

        // Adding books to the queue from both ends
        bookQueue.addFirst("Harry Potter");
        bookQueue.addLast("To Kill a Mockingbird");
        bookQueue.addFirst("1984");
        bookQueue.addLast("Moby-Dick");

        // Displaying the book queue
        System.out.println("Books in Queue: " + bookQueue);

        // Removing books from both ends
        String removedFirst = bookQueue.removeFirst();
        String removedLast = bookQueue.removeLast();

        // Displaying removed books
        System.out.println("Removed from Front: " + removedFirst);
        System.out.println("Removed from End: " + removedLast);

        // Displaying the updated book queue
        System.out.println("Updated Books in Queue: " + bookQueue);

	}

}


/* ouput:-
 * Books in Queue: [1984, The Great Gatsby, To Kill a Mockingbird, Moby-Dick]
Removed from Front: 1984
Removed from End: Moby-Dick
Updated Books in Queue: [The Great Gatsby, To Kill a Mockingbird]
*/
