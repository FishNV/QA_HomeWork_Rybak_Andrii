package HomeWork2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число от 5 до 15");
        long num = scan.nextLong();

        long result = 1;

        while (num < 5 || num > 15){
            System.out.println("Неверное число, введите число от 5 до 15");
            num = scan.nextInt();
        }

        for (long i = num; i > 0; i--){
            result *= i;

        }
        System.out.println("Факториал числа " + num + "! = " + result);


    }
}
