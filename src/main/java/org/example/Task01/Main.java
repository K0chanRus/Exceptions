package org.example.Task01;

public class Main {
    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    //Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки,
    //иначе - длину массива.
    public static void main(String[] args) {
        System.out.println(checkArrayLength(new int[]{1, 2, 3}, 5));
    }
    public static int checkArrayLength(int[] arr, int min){
        if (arr.length < min){
            return -1;
        }
        else return arr.length;
    }
}