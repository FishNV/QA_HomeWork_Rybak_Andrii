package HomeWork2;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 30);
        }

        int [] newArr = Arrays.copyOf(arr, 2 *arr.length);

        for (int i = 0; i <=newArr.length -1; i++){
            if(i>=15){
                newArr[i]=newArr[i-15]*2;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}
