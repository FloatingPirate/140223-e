package com.task1;

/**
 * Задание 1:
 * Нарисовать схему STACK | HEAP по коду написаному в методе "main" ниже.
 */
public class PrimitivesTask {
    public static void main(String...args) {
        int numberX = 10;
        int numberY = 250;
        int numberZ = 449;
        int numberD = 8500;

        numberX = numberY;
        numberD = numberZ;
        numberD = numberY;
        numberY = numberX;

        System.out.println(numberX);
        System.out.println(numberY);
        System.out.println(numberZ);
        System.out.println(numberD);
    }
}
