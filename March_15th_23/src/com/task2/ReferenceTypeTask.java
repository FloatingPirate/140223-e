package com.task2;

import com.task2.objects.Airplane;
import com.task2.objects.Building;
import com.task2.objects.Cat;

/**
 * Задание 2:
 * Нарисовать схему STACK | HEAP по коду написаному в методе "main" ниже.
 */
public class ReferenceTypeTask {
    public static void main(String...args) {
        Airplane planeAirBaltic = new Airplane();
        Airplane planeNordway = new Airplane();

        Building building;

        Cat catTom = new Cat();
        Cat catDaisy = new Cat();

        Cat catSteven = new Cat();
        Cat catGeorge = new Cat();


        planeAirBaltic = planeNordway;
        planeAirBaltic.speed = 2000;
        planeNordway = planeAirBaltic;
        planeNordway.speed = 500;

        catDaisy.speed = 5090;
        catTom.speed =catDaisy.speed;
        catDaisy.speed = 9000;

        System.out.println(catTom.speed);
        System.out.println(catDaisy.speed);


    }
}
