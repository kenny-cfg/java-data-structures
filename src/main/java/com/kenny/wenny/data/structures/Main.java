package com.kenny.wenny.data.structures;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
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