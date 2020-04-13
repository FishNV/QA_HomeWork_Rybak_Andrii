package HomeWork2;

import java.util.Scanner;

public class FlatNumber {
    public static void main(String[] args) {
        int flat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        flat = scan.nextInt();

        int entrance = (flat-1)/36+1;
        int floor = (flat-36*(entrance-1)-1)/4+1;

        if (flat > 0 && flat < 145){
            System.out.println("Подъезд: "+entrance);

            System.out.println("Этаж: "+floor);
        }
        else {
            System.out.println("Такой квартиры в доме нет");
        }
    }
}
