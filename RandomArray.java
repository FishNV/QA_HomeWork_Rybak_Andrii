package HomeWork2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите желаемый размер массива");

        int length = scan.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 300);
        }

        System.out.println(Arrays.toString(arr));

    }
}
