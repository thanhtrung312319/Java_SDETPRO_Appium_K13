package Java_Lab;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Java_Lab_4 {
    public static void main(String[] args) {


            System.out.print("Please enter slot numbers");
            int arrayListSize = getUserInput();
            while (arrayListSize < 2) {
                System.out.print("Please input a positive number differs 0 or 4: ");
                arrayListSize = getUserInput();
            }

            List<Integer> arrayNumberList = randomNumberArrayList(arrayListSize);

            printMenu();

            System.out.print("Please input an option: ");
            int userInput = getUserInput();
            while (userInput != 4) {
                switch (userInput) {
                    case 1:
                        System.out.println("==*>>> Your numbers are: " + arrayNumberList);
                        break;
                    case 2:
                        System.out.printf("==*>>> Maximum number is: %d\n", maxValue(arrayNumberList));
                        break;
                    case 3:
                        System.out.printf("==*>>> Minimum number is: %d\n", minValue(arrayNumberList));
                        break;
                    default:
                        System.out.println("To continue the game, Press choose from 1 - 3");
                        System.out.println("To end the game, Please enter choose 4");
                }

                printMenu();
                System.out.print("Please input an option: ");
                userInput = getUserInput();
            }

            System.out.println("See you again!!!!");
        }

        public static List<Integer> randomNumberArrayList ( int arrayListSize){
            List<Integer> arrayListNumber = new ArrayList<>();

            for (int i = 0; i < arrayListSize; i++) {
                int randomNumber = new SecureRandom().nextInt(1000) + 1;
                arrayListNumber.add(randomNumber);
            }
            return arrayListNumber;
        }

        public static void printMenu () {
            System.out.println("\n=====MENU======");
            System.out.println("1. Print all numbers");
            System.out.println("2. Print maximum value");
            System.out.println("3. Print minimum value");
            System.out.println("4. Quit");
        }

        public static int getUserInput () {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }


        public static int maxValue (List < Integer > arrayList) {

            int maxNumber = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++)
                if (arrayList.get(i) >= maxNumber)
                    maxNumber = arrayList.get(i);

            return maxNumber;
        }

        public static int minValue (List < Integer > arrayList) {

            int minNumber = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++)
                if (arrayList.get(i) <= minNumber)
                    minNumber = arrayList.get(i);

            return minNumber;
        }
    }
