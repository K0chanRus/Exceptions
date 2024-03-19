package org.example.Atest1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the following data separated by a space in one line:");
        System.out.println("Last name, First name, Patronymic, Date of birth in the format dd.mm.yyyy, Phone number, Gender f/m");
        Scanner scanner = new Scanner(System.in);
        String lName = scanner.next();
        String fName = scanner.next();
        String mName = scanner.next();
        String date = scanner.next();
        String phone = scanner.next();
        String gen = scanner.next();
        InStr inStr = new InStr(lName, fName, mName, date, phone, gen);
        if (date.length() != 10) {
            System.out.println("Error: The date was entered incorrectly!");
        } else if (phone.length() != 11) {
            System.out.println("Error: The phone number was entered incorrectly!");
        } else if (gen.equalsIgnoreCase("f") || gen.equalsIgnoreCase("m")) {
            String fileName = lName + ".txt";
            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                fileWriter.write(String.valueOf(inStr));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Error: The gender is entered incorrectly, enter m or f");
        }

    }
}
