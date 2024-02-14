package com.basic.codewars.kata7;

import com.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReverseWords {

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);

        String str = "The quick brown fox jumps over te lazy dog";
        principal(str);

    }

    private static String principal(String str) {

        String texto = "The quick brown fox jumps over te lazy dog.";

        String[] array = texto.split(" ");

        StringBuilder resultadoFinal = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            String convertida = convertir(temp);
            resultadoFinal.append(convertida);
            if (i < array.length){
                resultadoFinal.append(" ");
            }
        }

        System.out.print(resultadoFinal.toString());

        return resultadoFinal.toString();

    }

    private static String convertir(String temp) {

        char[] charArreglo = temp.toCharArray();

        int left = 0;
        int right = charArreglo.length -1;

        while (left < right){
            char tempo = charArreglo[left];
            charArreglo[left] = charArreglo[right];
            charArreglo[right] = tempo;
            left++;
            right--;
        }

        return new String(charArreglo);

    }

}
