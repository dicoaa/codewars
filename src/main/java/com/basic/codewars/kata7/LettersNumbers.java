package com.basic.codewars.kata7;

import com.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class LettersNumbers {
    public static void main(String[] args){
        SpringApplication.run(BasicApplication.class, args);
        
        List lista = List.of(1, "a", "b", 2);
        
        principal(lista);
        
    }



    //In this kata you will create a function that takes a list of non-negative integers 
    // and strings and returns a new list with the strings filtered out.

    public static Object principal(List lista){
        
        List nuevaLista = new ArrayList<>();


        for (int i = 0; i < lista.size(); i++) {
            String temp = lista.get(i).toString();

            try {
                int numero = Integer.parseInt(temp);
                if (numero / numero == 1) {
                    nuevaLista.add(numero);
                }
            }
            catch (NumberFormatException e){
                i++;
            }
        }



        System.out.print(nuevaLista);

        return nuevaLista;

    }


}

//Hace falta cuando numero sea cero