package edu.wctc.property.demo;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //Scanner kb = new Scanner(System.in);

        //System.out.println("Enter cylinders: ");
        System.out.println("Must be between " + Engine2.MIN_CYLINDERS + " and " + Engine2.MAX_CYLINDERS + ".");

        Engine2 e = new Engine2(13);
    }
}
