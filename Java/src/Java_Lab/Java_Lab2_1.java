package Java_Lab;

import java.util.Scanner;


public class Java_Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your Weight(kg)");
        float clientWeight = scanner.nextFloat();
        System.out.println("Please enter your Hight(m)");
        float clientHight = scanner.nextFloat();
        float clientBMI = clientWeight /(clientHight*2);
        System.out.println("Your BMI is: " + clientBMI);
        if (clientBMI <= 18.5){
            System.out.println("You'r Under weight");
        } else if (clientBMI >= 18.5 && clientBMI <= 24.9) {
            System.out.println("You'r Normal weight");
        } else if (clientBMI >= 25 && clientBMI <= 29.9)
        System.out.println("You'r Overweight");
        else if (clientBMI >= 30)
        System.out.println("You'r Obesity");

    }
}
