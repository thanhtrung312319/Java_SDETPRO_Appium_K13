package Java_Lab;
import java.util.Scanner;
public class Java_Lab_6_2 {
    public static void main (String[] args){
        String myPassword = "password123";
        checkpassword(myPassword);
    }
    public static void checkpassword(String myPassword) {
        int maxTemp = 0;
        Scanner scanner = new Scanner(System.in);
        while (maxTemp < 3) {
            maxTemp++;
            System.out.println("Enter your password: ");
            String userInput = scanner.nextLine();
            if (userInput.equals(myPassword)) {
                System.out.println("Enter correct password, Progressing....");
                break;
            } else {
                System.out.println("Please enter again");
            } if (maxTemp == 3) {
                System.out.println("Please contact to help desk service");
            }
        }
    }
}

