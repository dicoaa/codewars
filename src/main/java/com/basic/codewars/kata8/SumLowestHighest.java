package com.basic.codewars.kata8;

import com.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumLowestHighest {

    /*
    Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
    The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
     */

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);

        int[] lista = new int[6];
        lista[0] = 6;
        lista[1] = 5;
        lista[2] = 1;
        lista[3] = 3;
        lista[4] = 2;
        lista[5] = 4;
        //int[] lista = {6,2,3,1};
        sumLoHi(lista);

    }

    private static int sumLoHi(int[] numbers) {

        int numeroMenor = numbers[0];
        int numeroMayor = numbers[0];
        int resultado = 0;

        for (int i = 0; i < numbers.length ; i++) {
            //if (numbers[i] != null){HACER QUE VERIFIQUE NULOS}
            if (numbers[i] < numeroMenor){
                numeroMenor = numbers[i];
            }
            if (numbers[i] > numeroMayor){
                numeroMayor = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            resultado+=numbers[i];
        }
        resultado -= numeroMenor;
        resultado -= numeroMayor;

        return resultado;
    }

}
