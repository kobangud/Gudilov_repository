package com.max.idea;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String [] args ) throws IOException {


        /** Задача №1_Первая программа
         * Вывести на консоль текст “Hello World!”:
         *
         * 1. Скачать и установить IntelliJ IDEA.
         *
         * 2. Написать первую программу, которая выводит в консоль строку “Hello World!”.
         *
         * 3. Подключиться к GitHub, залить программу в созданный репозиторий.
         */
        System.out.println("ЗАДАЧА №1_Первая программа");

        System.out.println("Hello World");
        System.out.println(" ");
        System.out.println("*************************");
        System.out.println(" ");

        /** Задача №2_Типы данных
            Создание переменных:
            1. Создайте переменную типа с плавающей точкой с наибольшим диапазоном чисел. Присвойте ей произвольное дробное значение
            2. Создайте переменную целочисленного типа с наименьшим диапазоном чисел. Присвойте ей наибольшее возможное значение
        */

        System.out.println("ЗАДАЧА №2_Типы данных");

        System.out.println("Переменная с плавающей точкой с наибольшим диапазоном чисел");

        System.out.println("Это: " + "double num = 1234567.12345");

        System.out.println("Переменная целочисленного типа с наименьшим диапазоном чисел");

        System.out.println("Это: " + "byte a = 127");

        double num = 1234567.12345;
        byte a = 127;

        System.out.println(" ");
        System.out.println("*************************");
        System.out.println(" ");

        /** Задача №3_Массивы
         *Выполните следующие действия с массивом:
         *
         * 1. Задайте массив из 5 любых целых чисел
         *
         * 2. Поменяйте местами первый и последний элемент в массиве
         *
         * 3. Вывести в консоль результат суммы первого и среднего элемента
         *
         * Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
         */

        System.out.println("ЗАДАЧА №3_Массивы");

        int[] array1 = {2,5,6,8,7};
        int d = array1[0];
        array1 [0] = array1[array1.length - 1];
        array1[array1.length-1] = d;
        System.out.println("Сумма первого и среднего элементов =  " + (array1[0] + array1[array1.length-3]));

        System.out.println(" ");
        System.out.println("*************************");
        System.out.println(" ");

        /** Задача №4_Операторы
         * 1. Ввести три числа с клавиатуры x, y, z
         *
         * 2. Найти и вывести в консоль среднее арифметическое этих чисел
         *
         * 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
         *
         * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

         */

        System.out.println("ЗАДАЧА №4_Операторы");
        Scanner in = new Scanner(System.in);
        int x,y,z;
        int srAref;

        System.out.println("Введите поочередно три произвольных числа");

        x =  in.nextInt();
        y =  in.nextInt();
        z =  in.nextInt();

        System.out.println("Вы ввели: " + x +" ," + y +" ,"+ z );
        srAref = (x+y+z)/3;


        System.out.println("среднее арифметическое этих чисел");
        System.out.print("Результат: ");
        System.out.println((x+y+z)/3);

       if ((srAref/2) > 3) {
            System.out.println("Программа выполнена корректно");

        }
        System.out.println(" ");
        System.out.println("*************************");
        System.out.println(" ");


        }
}