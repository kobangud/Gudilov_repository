package com.max.idea;


import java.util.Arrays;

public class Main {


    public static void main(String [] args ) {

      /*  double num = 1234567.12345;
        byte a = 127;

        System.out.println("Hello World");

        int[] array2 = {1,2,3,4,5,6,7,8,9};

                for (int i = 0; i<array2.length; i++) {
                    if (!(array2[i] % 2 == 0)){
                        System.out.println(i);
                    }
       */

        int[] array1 = {2,5,6,8,7};
        int a = array1[0];
        array1 [0] = array1[array1.length - 1];
        array1[array1.length-1] = a;
        System.out.println("Сумма первого и среднего элементов =  " + (array1[0] + array1[array1.length-3]));


        }
}