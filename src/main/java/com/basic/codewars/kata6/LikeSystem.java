package com.basic.codewars.kata6;

import com.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LikeSystem {

    public static void main(String[] args){
        SpringApplication.run(BasicApplication.class, args);

        /*
        You probably know the "like" system from Facebook and other pages.
        People can "like" blog posts, pictures or other items.
        We want to create the text that should be displayed next to such an item.

        Implement the function which takes an array containing the names of people that like an item.
        It must return the display text as shown in the examples:

        []                                -->  "no one likes this"
        ["Peter"]                         -->  "Peter likes this"
        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
         */

        String[] nombres = new String[4];
        nombres[0]="Peter";
        nombres[1]="Jacob";
        nombres[2]="Alex";
        nombres[3]="Mary";

        metlikeSys(nombres);
    }

    private static String metlikeSys(String[] names) {

        StringBuilder resultado = new StringBuilder();

        String particion = String.join(" ", names);
        //System.out.print(particion);

        if (names[3] != null) {
            //System.out.print("Peter, Alex y 2 mas");
            resultado.append(names[0] + ", "  + names[1] + " and 2 others like this");
        } else if (names[2] != null) {
            //System.out.print("Peter, Alex, Juan");
            resultado.append(names[0] + ", " + names[1] + " and " + names[2] + " like this");
        } else if (names[1] != null) {
            //System.out.print("Peter y Alex");
            resultado.append(names[0] + " and " + names[1] + " like this");
        } else if (names[0] != null) {
            //System.out.print("Peter");
            resultado.append(names[0] + " likes this");
        } else if (names[0] == null) {
            //System.out.print("Nadie");
            resultado.append("No one likes this");
        }

        System.out.print(resultado.toString());
        return resultado.toString();
    }
}
