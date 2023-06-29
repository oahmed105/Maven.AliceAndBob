import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String line = input.nextLine();
    String name1 = "Alice";
    String name2 = "Bob";

    if (line.equalsIgnoreCase(name1)) {
        System.out.println("Hello Alice!");
    }
    else if (line.equalsIgnoreCase(name2)) {
        System.out.println("Hello Bob!");
    }
    else {
        System.out.println("Go away!");
    }
    }
}
