import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
 * <h1>LinkedList Program</h1>
 * A class that creates, builds, sorts, and displays
 * a LinkedList.
 * @author James Wangler
 * @version 1.0.0
 * @since Week 4 of CSC 6301 - 06/01/2023
 */

public class ListProject {
    /**
     * Main method of the class. It creates the LinkedList.
     * Then gets user input on the size of the list and each 
     * integer that should be in the list. Finally, it sorts
     * and prints the list.
     * @param args the command line arguments - unused
     * @since Week 4 of CSC 6301 - 06/01/2023
     */

    public static void main(String[] args) {
        //Creates a LinkedList object
        LinkedList<Integer> myList = new LinkedList<Integer>();

        Scanner scanner = new Scanner(System.in);

        //Asks the user for linkedList length
        System.out.print("How many numbers do you want in your list? \n");
        int listLength = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        while (i < listLength) {
            System.out.print("Enter integer: ");
            myList.add(scanner.nextInt());
            i++;
        }

        //Closes the scanner and prints the list
        scanner.close();
        Collections.sort(myList);
        System.out.println("\nHere is the sorted list:");
        System.out.println(myList);
    }
}