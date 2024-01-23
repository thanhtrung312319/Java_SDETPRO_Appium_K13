package Java_Lab;

import java.util.Arrays;

public class Java_Lab3_1 {

    public static void main(String[]args) {

        int[] intArr = {1, 5, 3, 7, 6, 4};

        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0)
                countEven++;
            else countOdd++;
        }

        System.out.println(Arrays.toString(intArr));
        System.out.printf("\nThis array has %d even number(s), %d odd number(s) \n", countEven, countOdd);
    }
}
