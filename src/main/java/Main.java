import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        if (name.equals("Alice")) {
            System.out.println("Hello, Alice.");
        } else if (name.equals("Bob")) {
            System.out.print("Hello, Bob.");
        } else if (name.equals("alice")){
            System.out.print("Hello, alice.");
        } else if (name.equals("bob")) {
            System.out.println("Hello, bob.");
        } else if (name.equals("BOB")) {
            System.out.println("Hello, BOB.");
        } else if (name.equals("ALICE")) {
            System.out.println("Hello, ALICE.");
        } else {
            System.out.println("You are not ALice or Bob.");
        }

    }
}