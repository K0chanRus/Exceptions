package org.example.DZ1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = new int[5];
        int boom = array[10];
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 25/0;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String b = "gfh";
        int c = Integer.parseInt(b);
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
