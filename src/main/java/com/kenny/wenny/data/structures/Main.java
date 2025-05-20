package com.kenny.wenny.data.structures;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        for (var i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }

    public static void loops(String[] args) {
        var counter = 1;
        while (counter < 1000) {
            System.out.println("Counter is " + counter);
            counter = counter * 2;
        }
        System.out.println("Finished!");
        // Infinite loop: please don't run
        /*
        while (true) {
            System.out.println("Hello");
        }
         */
    }

    public static void exercisesUpTo2(String[] args) {
        for (var i = 0; i < 10; i++) {
            System.out.println("Hello for time number " + i);
        }
        // Exercise 1
        /*
        Print the numbers 20-30 (20,21,...,30)
        Print the numbers 10-0 (10,9,8,7,6,5,4,3,2,1)
         */
        System.out.println("***Exercise 1***");
        for (var i = 20; i <= 30; i++) {
            System.out.println(i);
        }
        for (var i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // For each example
        System.out.println("*** For each example ***");
        String[] tvShows = {"Star Trek", "Doctor Who", "Top of the Pops"};
        for (var tvShow : tvShows) {
            System.out.println(tvShow);
        }
        // Exercise 2
        /*
        Make an array of integers (any numbers, small, e.g. 5 elements)
        Using a for each loop, print out the value of the number squared
         */
        System.out.println("*** Exercise 2 ***");
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        for (var age : ages) {
            System.out.println("The square of " + age + " is " + age * age);
        }
    }
    /*
    Starter exercise
    public static void main(String[] args) {
        String[] someStrings = { "Violeta", "Jessie", "Rads", "Nade", "Ekta", "Paula" };
        System.out.println(someStrings[4]);
        // Type inference in Java
        var animalMap = Map.of(
                "dog", "mary",
                "cat", "kate"
        );
    }
     */
}