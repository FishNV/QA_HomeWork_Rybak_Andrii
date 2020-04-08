package HomeWork;

import org.openqa.selenium.json.JsonOutput;
import org.w3c.dom.ls.LSOutput;

public class SumOfStrings {
    public static void main(String[] args) {
        String a = "4";
        String b = "10";
        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int cc = aa+bb;
        String c = Integer.toString(cc);
        System.out.println("Сумма двух чисел равна " + c);
    }




}
