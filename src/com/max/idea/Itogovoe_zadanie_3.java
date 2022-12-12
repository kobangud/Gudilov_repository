package com.max.idea;

import java.io.IOException;

import java.util.Scanner;

public class Itogovoe_zadanie_3 {
    public static void main(String[] args) throws IOException {
        /** Итоговая задача № 3
         Инструкция
         Напишите программу, где пользователь вводит сначала количество строк n,
         затем сами строки.
         Среди данных строк найти строку с максимальным количеством различных символов.
         Если таких строк будет много, то вывести первую.

         Пример для теста работы программы:

         Количество строк: 3
         Строка 1: привет
         Строка 2: анализ
         Строка 3: 111111111111
         Ответ: привет
         */

        System.out.println("Итоговая задача № 3\n");

        Scanner Skaner = new Scanner(System.in);
//        int l = 0;
//        int s;
//        String slovo = "";
//        System.out.println("Введите количество строк массива");
//        String e = Skaner.nextLine();
//        String[] MassStroka = new String[Integer.parseInt(e)];
//        System.out.println("Введите аргументы массива");
//        for (int i = 0; i < MassStroka.length; i++) {
//
//            MassStroka[i] = Skaner.nextLine();
//        }
//        for (int i = 0; i < MassStroka.length; i++) {
//
//            System.out.println("Строка " + (i + 1) + ": " + MassStroka[i]);
//        }
//        for (int i = 0; i < MassStroka.length; i++) {
//            s = (int) MassStroka[i].chars().distinct().count();
//
//            if (s > l) {
//                slovo = MassStroka[i];
//                l = s;
//            }
//        }
//        System.out.println("Строка с максимальным количеством различных символов " + slovo);

        /**Итоговая задача №4
         Инструкция
         Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
         Ответ: “Заархивированный вирус”.


         1. У пользователя есть 3 попытки, чтобы отгадать загадку.

         2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.

         3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.

         4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.

         5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
         Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.

         6. Если пользователь, использовавший подсказку, ошибется,
         вывести “Обидно, приходи в другой раз” и завершить работу.
         */
        System.out.println("Итоговая задача №4\n");

        System.out.println("Отгадайте загадку: \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");


        String podskaz = "Подсказка";
        String otvet = "лук";
        System.out.println("Попытка №1. Для подсказки напишите слово - Подсказка");
        System.out.println("Введите ответ");


        String ot1 = Skaner.nextLine(); //Попытка №1

        if (otvet.contains(ot1)) {
            System.out.println("Правильно!");
            return;
        } else if (podskaz.contains(ot1)) {
            System.out.println("Горький овощ");
            ot1 = Skaner.nextLine();
            if (otvet.contains(ot1)) {
                System.out.println("Правильно!");
                return;
            } else
                System.out.println("Обидно, приходи в другой раз");
            return;

        } else {
            System.out.println("Подумай еще!");
        }


        ot1 = Skaner.nextLine();        // Попытка №2
        if (otvet.contains(ot1)) {
            System.out.println("Правильно!");
            return;
        } else if (podskaz.contains(ot1)) {
            System.out.println("Подсказка уже недоступна\nПопробуй еще!");
            ot1 = Skaner.nextLine();
            if (otvet.contains(ot1)) {
                System.out.println("Правильно!");
                return;
            } else {
                System.out.println("Подумай еще!");
            }
        } else {
            System.out.println("Подумай еще!");
        }


        ot1 = Skaner.nextLine();        // Попытка №3
        if (otvet.contains(ot1)) {
            System.out.println("Правильно!");

        } else if (podskaz.contains(ot1)) {
            System.out.println("Подсказка уже недоступна");
            ot1 = Skaner.nextLine();
            if (otvet.contains(ot1)) {
                System.out.println("Правильно!");

            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
        else{
                System.out.println("Обидно, приходи в другой раз");
            }
        }

    }




