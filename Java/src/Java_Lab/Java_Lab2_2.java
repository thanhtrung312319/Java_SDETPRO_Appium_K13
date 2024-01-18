package Java_Lab;

import java.util.Scanner;

public class Java_Lab2_2 {
   public static void main (String[]arg ) {
       Scanner scanner = new Scanner (System.in);
       System.out.println("Please input your number:");
       int yourNumber = scanner.nextInt();
       if (yourNumber % 2 == 0)
       {System.out.println("Your numbers is even");} else {System.out.println("Your numbers is odd");
       }
    }
}
