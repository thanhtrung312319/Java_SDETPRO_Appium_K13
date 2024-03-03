package Java_Lab.Java_Lab8_2;

import Java_Lab.Java_Lab8_1.ContractEmployee;
import Java_Lab.Java_Lab8_1.Employee;
import Java_Lab.Java_Lab8_1.EmployeeController;
import Java_Lab.Java_Lab8_1.FullTimeEmployee;

import java.util.Arrays;
import java.util.List;

public class AnimalController {


    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        int horseSpeed = horse.speed;
        int tigerSpeed = tiger.speed;
        int dogSpeed = dog.speed;

            String winner;
            int maxSpeed = Math.max(horseSpeed, Math.max(tigerSpeed, dogSpeed));
            if (maxSpeed == horseSpeed) {
                winner = "Horse";
            } else if (maxSpeed == tigerSpeed) {
                winner = "Tiger";
            } else {
                winner = "Dog";
            }
            System.out.println("Winner is: " + winner + ", with speed: " + maxSpeed + " km/h");
        }
    }

