package com.basic.codewars.kata7;

import com.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LettersNumbers {
    public static void main(String[] args){
        SpringApplication.run(BasicApplication.class, args);

        List lista = List.of(1, 2, "asf", "1", "123", 123);
        principal(lista);

        /*
          public static List filterList(final List<Object> list) {
            return list.stream()
              .filter(e -> e instanceof Integer)
              .collect(Collectors.toList());
        }
         */
    }

    //In this kata you will create a function that takes a list of non-negative integers 
    // and strings and returns a new list with the strings filtered out.

    public static Object principal(List lista){
        
        List nuevaLista = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {

            Object tempPrueba = lista.get(i);

            if (tempPrueba instanceof String){
                //System.out.print("Entro");
                //i++;
            }else{
                String temp = lista.get(i).toString();

                //if (temp(1) == )

                try {
                    int numero = Integer.parseInt(temp);
                    if (numero == 0) {
                        nuevaLista.add(numero);
                    } else if (numero / numero == 1) {
                        nuevaLista.add(numero);
                    }
                }
                catch (NumberFormatException e){

                }
            }


        }

        System.out.print(nuevaLista);

        return nuevaLista;

    }

}
