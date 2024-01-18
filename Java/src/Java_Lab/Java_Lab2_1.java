package Java_Lab;

import java.util.Scanner;


public class Java_Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your Weight(kg)");
        double clientWeight = scanner.nextFloat();
        System.out.println("Please enter your Hight(m)");
        double clientHight = scanner.nextFloat();
        double clientBMI = clientWeight /(clientHight*2);
        System.out.println("Your BMI is: " + clientBMI);
        if (clientBMI <= 18.5){
            System.out.println("You're Under weight");
        } else if (clientBMI > 18.5 && clientBMI <= 24.9) {
            System.out.println("You're Normal weight");
        } else if (clientBMI >= 25 && clientBMI <= 29.9)
        System.out.println("You're Overweight");
        else if (clientBMI >= 30)
        System.out.println("You're Obesity");

    }
}
