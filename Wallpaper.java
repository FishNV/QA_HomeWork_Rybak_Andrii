package HomeWork2;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите нужное количество полос");
        int amount = scan.nextInt();

        String a = "***";
        String b = "+++";

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < amount; j++){
                if (j%2 == 0) {
                    System.out.print(a);
                } else {
                    System.out.print(b);
                }
            }
            System.out.println();


        }

    }
}
