package org.example.Task02;

public class Main {
    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
    //значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
    //например:
    //1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
    //качестве кода ошибки.
    //2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    //3. если вместо массива пришел null, метод вернет -3
    //4. придумайте свои варианты исключительных ситуаций и верните соответствующие
    //коды ошибок.
    
    public static void main(String[] args) {
        System.out.println(checkArrayLength(new int[]{1, 2, 3, 4, 5, 6}, 6, 3));
    }
    public static int checkArrayLength(int[] arr, int min, int numberToFind){
        if (arr == null){
            System.out.println("Array can't be null");
            return -3;
        }
        else if (arr.length < min){
            System.out.println("Length of the array is less than min");
            return -1;
        }
        else if (numberToFind % 2 == 0){
            return  -4;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToFind){
                    return i;
                }
            }
        }
        System.out.println("The number isn't in the array");
        return -0;
    }
}
