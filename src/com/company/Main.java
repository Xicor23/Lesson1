package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String c = input.next();
        perfectRandom newname = new perfectRandom(c);
        Random rand = new Random();
        int number = rand.nextInt(100);
        newname.getNumber(number);

    }
}
