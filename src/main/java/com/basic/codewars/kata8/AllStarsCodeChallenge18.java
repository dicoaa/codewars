package com.basic.codewars.kata8;

import com.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AllStarsCodeChallenge18 {public static void main(String[] args) {
    SpringApplication.run(BasicApplication.class, args);

    //String str = "The quick brown fox jumps over te lazy dog";

    Scanner scanner1 = new Scanner(System.in);
    System.out.print("Ingrese la palabra: ");
    String str = scanner1.next();

    Scanner scanner2 = new Scanner(System.in);
    System.out.print("Ingrese la letra que desea contar en la palabra anterior: ");
    String letra = scanner2.next();

    char[] letrasChar = letra.toCharArray();
    char letter = letrasChar[0];

    principal(str, letter);

}

    //Create a function that accepts a string and a single character, and returns an integer of the count of occurances
    //the 2nd argument in found in the first one

    private static String principal(String str, char letter) {




        char[] palabrasCharArray = str.toCharArray();

        int repeticiones = 0;

        for (int i = 0; i < palabrasCharArray.length; i++){
            char temp = palabrasCharArray[i];
            if (temp == letter){
                repeticiones++;
            }
        }

        System.out.print(repeticiones);

        return null;
    }



}
