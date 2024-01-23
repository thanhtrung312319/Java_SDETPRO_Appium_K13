package Java_Lab;
import java.util.Arrays;
public class Java_Lab3_2 {


public static void  main (String[] args) {
    int[] intArr = new int[]{1, 5, 3, 7, 6, 4};

    int min = intArr[0];

    int max = intArr[0];

    for (int index = 0; index < intArr.length; index++) {
        if (intArr[index] < min)
            min = intArr[index];
        if (intArr[index] > max)
            max = intArr[index];
    }

    System.out.printf("\nMinimum number is %d, maximum number is %d", min, max);
    }
}