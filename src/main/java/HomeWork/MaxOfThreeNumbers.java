package HomeWork;

import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a >c){
            System.out.println(a + " - это самое большое число");
        } else if (b > a && b > c){
            System.out.println(b + " - это самое большое число");
        } else if (c > a && c > b){
            System.out.println(c + " - это самое большое число");
        }


    }
}
