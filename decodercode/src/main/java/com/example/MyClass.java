package com.example;
import java.util.*;
//Project Plan
/*
Dylan Weaver-

Create a program that allows text to be entered in as one thing but then outputs as another.
Reverse the Alphabet
make a=z b=y c=x etc...
 */

public class MyClass {

    public static void main(String[] args) {
        System.out.print("Please Input words to get the coded version!\n");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String Str = new String(input);

        System.out.println(Str.substring(1,3)+'\u0061' +'\u0079'+'\u006f');

        System.out.println();


    }

}

