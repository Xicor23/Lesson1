package com.company;
import java.util.*;
/**
 * Created by wy733 on 10/10/16.
 */
public class perfectRandom {
    public String name;
    public int firstnumber;
    public perfectRandom(String input) {
        name = input;
        System.out.println("Nice to meet you " + name);
    }
    public int getNumber(int number)
    {
        firstnumber = number;
        int b = firstnumber*firstnumber;
        System.out.println("Your lucky number is "+ b);
        return b;
    }


}


