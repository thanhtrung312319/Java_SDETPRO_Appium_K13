package Java_Lab;
import java.util.Arrays;
public class Java_Lab_3_3 {
    public static void  main (String[] args) {
        int[] arrNum = new int[]{12, 34, 1, 16, 28};

        //for i -> length - 1
        //for j -> length
        //if index[j] < index[i] -> swap
        for (int i = 0; i < arrNum.length - 1; i++) {
            for (int j = i + 1; j < arrNum.length; j++) {
                if (arrNum[j] < arrNum[i]) {
                    int tmp = arrNum[j];
                    arrNum[j] = arrNum[i];
                    arrNum[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrNum));
    }

}

