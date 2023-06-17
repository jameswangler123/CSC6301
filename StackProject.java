import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;

/**
 * <h1>Stack Program</h1>
 * A class that creates, builds, sorts, and displays
 * a Stack.
 * @author James Wangler
 * @version 1.0.0
 * @since Week 5 of CSC 6301 - 06/10/2023
 */

public class StackProject {
    /**
     * Main method of the class. It creates the Stack.
     * Then gets user input on the size of the stack and each 
     * integer that should be in the stack. Finally, it sorts
     * and prints the stack.
     * @param args the command line arguments - unused
     * @since Week 5 of CSC 6301 - 06/10/2023
     */


    public static void main(String[] args) {
        //Creates a Stack object
        Stack<Integer> myStack = new Stack<Integer>();

        //Uses the Scanner class to accept input from the user
        Scanner scanner = new Scanner(System.in);
        
        //Asks the user for desired stack length
        System.out.print("How many numbers do you want in your Stack? \n");
        int listLength = scanner.nextInt();
        scanner.nextLine();

        //While loop to push integers into the stack
        int i = 0;
        while(i < listLength) {
            System.out.println("Enter integer: ");
            myStack.push(scanner.nextInt());
            i++;
        }

        //Closes the scanner, sorts and then prints the stack
        scanner.close();
        Collections.sort(myStack);
        System.out.println("\nHere is the sorted Stack:");
        System.out.println(myStack);
    }
}
