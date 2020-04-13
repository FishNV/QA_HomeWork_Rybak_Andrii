package HomeWork2;

import java.util.Scanner;

public class SymbolBCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите строку на английском");
        String str = scan.nextLine();

        char [] b = str.toCharArray();

        int count = 0;

        char bb = 'b';

        for (int bbb : b){
            if (bbb == bb)
                count += 1;
        }
        System.out.println(count);
    }
}
