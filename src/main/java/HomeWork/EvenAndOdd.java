package HomeWork;

import lesson1.ScannerSomeSymbols;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите четное число");
        int a = scan.nextInt();

        if (a%2 == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
