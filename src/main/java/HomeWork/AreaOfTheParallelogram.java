package HomeWork;

import java.util.Scanner;

public class AreaOfTheParallelogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение стороны a");
        int a = scan.nextInt();
        System.out.println("Введите значение стороны b");
        int b = scan.nextInt();
        System.out.println("Введите значиние кута между сторонами");
        double c = scan.nextDouble();
        double sinC = Math.toRadians(c);
        double s = a*b*Math.sin(sinC);
        System.out.println("Площадь параллелограмма равна " + s);

    }
}
