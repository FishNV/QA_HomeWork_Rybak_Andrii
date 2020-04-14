package HomeWork2;

import java.util.Arrays;

public class OddNumbers {
    public static void main(String[] args) {
        int [] arr = {0,5,2,4,7,1,3,19};
        int a = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2 != 0){
                a++;
            }

        }
        System.out.println("В массиве " + a + " нечетных чисел");
    }
}
