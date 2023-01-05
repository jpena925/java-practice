package part_1;
//accepting an input from the user and printing it
import java.util.Scanner;

public class message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        String message = scanner.nextLine();
        System.out.println(message);

    }
}