package org.example.Task03;

public class Main {
    //Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    //Необходимо посчитать и вернуть сумму элементов этого массива.
    //При этом накладываем на метод 2 ограничения: метод может работать только с
    //квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
    //только значение 0 или 1.
    //Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
    //ошибке.
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
        };
        System.out.println(findSumTwoDimensionalArray(arr));
    }
    public static int findSumTwoDimensionalArray(int[][] arr){
        int height = arr.length;
        int sum = 0;
        for (int[] ints:arr){
            if(ints.length != height) throw new RuntimeException("The arrey is not squared");
            for (int anInt:ints){
                if (anInt == 0|| anInt ==1) {
                    sum+= anInt;
                } else throw new RuntimeException("Unacceptable value");
            }
        }
        return sum;
    }
}
