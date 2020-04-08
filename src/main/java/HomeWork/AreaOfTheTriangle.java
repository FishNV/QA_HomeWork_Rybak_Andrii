package HomeWork;

import java.util.Scanner;

public class AreaOfTheTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение первой стороны треугольника");
        double a = scan.nextDouble();
        System.out.println("Введите значение второй стороны треугольника");
        double b = scan.nextDouble();
        System.out.println("Введите значение третьей стороны треугольника");
        double c = scan.nextDouble();
        double p = (a+b+c)/2;
        double s2 = p*(p-a)*(p-b)*(p-c);
        double s = Math.sqrt(s2);
        System.out.println("Площадь треугольника равна "+ s);

    }
}
