package org.example.Task04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
    //целочисленный одномерный массив.
    //Метод должен пройтись по каждому элементу и проверить что он не равен null.
    //А теперь реализуйте следующую логику:
    //1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
    //пользователя
    //2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
    //“подсветить”
    public static void main(String[] args) {
        checkArray(new Integer[]{1, 2, 3});
    }
    public static void checkArray(Integer[] arr){
        List<Integer> cash = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==null){
                cash.add(i);
            }
        }
        if (!cash.isEmpty()){
            throw new RuntimeException(String.format("В ячейках с индексами %s встретиля null %n", cash));
        }else {
            System.out.println("null не встретились");
        }
        //1.36
    }
}
