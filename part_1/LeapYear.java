package part_1;


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        //if divisible by 4
        //but if its divisible by 100, it has to be divisble by 400
        
        if(year % 4 == 0 && !(year % 100 == 0)){
            System.out.println("The year is a leap year.");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}

