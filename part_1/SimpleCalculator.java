package part_1;


import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        System.out.println(first + " + " + sec + " = " + (first + sec));
        System.out.println(first + " - " + sec + " = " + (first - sec));
        System.out.println(first + " * " + sec + " = " + (first * sec));
        System.out.println(first + " / " + sec + " = " + (first / (double) sec));

    }
}
