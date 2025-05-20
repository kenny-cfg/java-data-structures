package com.kenny.wenny.data.structures;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
An array of Strings
    And an nth element of this (just pick any index)
A Hashmap of animal types & their names
    E.g. dog = mary, cat = kate
         */
        String[] someStrings = { "Violeta", "Jessie", "Rads", "Nade", "Ekta", "Paula" };
        System.out.println(someStrings[4]);
        // Type inference in Java
        var animalMap = Map.of(
                "dog", "mary",
                "cat", "kate"
        );
    }
}