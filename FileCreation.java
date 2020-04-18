package HomeWork3;

import java.io.*;
import java.util.Scanner;

public class FileCreation {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        File studentName = new File("studentName.txt");
        Scanner reader = new Scanner(studentName);

        if (!studentName.exists()) {
            try {
                studentName.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        writeFile(scan, studentName, reader);
    }

    public static void writeFile(Scanner scan, File studentName, Scanner reader) {
        try (FileWriter fw = new FileWriter(studentName, true)) {
            System.out.println("Введите фамилию");
            String lastName = scan.nextLine();

            System.out.println("Введите имя");
            String firstName = scan.nextLine();

            System.out.println("Введите отчество");
            String fatherName = scan.nextLine();

            if (!checkIfExists(reader, lastName)){
                fw.write(lastName + " ");
                fw.write(firstName + " ");
                fw.write(fatherName + "\n");
            } else {
                System.out.println("Такой студент уже существует");
            }
        } catch (IOException e) {

        }
    }

    public static boolean checkIfExists(Scanner lastNameScan, String lastName) {
        boolean result = false;

        while (lastNameScan.hasNextLine()) {
            String data = lastNameScan.nextLine();

            if (data.contains(lastName)){
                result = true;
                break;
            }
        }

        lastNameScan.close();
        return result;
    }
}