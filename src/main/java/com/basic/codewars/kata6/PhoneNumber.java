package com.basic.codewars.kata6;

import com.basic.BasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneNumber {
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);

        //Write a function that accepts an array of 10 integers
        // (between 0 and 9), that returns a string of those numbers in the form of a phone number
        // return -> (123) 456-7890

        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        principal(numbers);

    }

    private static String principal(int[] numbers) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < numbers.length; i++){
            if (i == 0){
                str.append("(");
            }
            if (i == 3){
                str.append(") ");
            }
            if (i == 6){
                str.append("-");
            }
            str.append(numbers[i]);


        }
        System.out.print(str);

        String resultadoCelular = str.toString();

        return resultadoCelular;
    }
}


