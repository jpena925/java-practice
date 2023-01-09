package part_1;


import java.util.Scanner;

//coercing inputs into their correct types
public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String strRes = scan.nextLine();
        System.out.println("Give an integer:");
        int intRes = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubRes = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booRes = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + strRes);
        System.out.println("You gave the integer " + intRes);
        System.out.println("You gave the double " + doubRes);
        System.out.println("You gave the boolean " + booRes);

    }
}
