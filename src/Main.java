
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException {


        /** Задача №1_Первая программа
         * Вывести на консоль текст “Hello World!”:
         *
         * 1. Скачать и установить IntelliJ IDEA.
         *
         * 2. Написать первую программу, которая выводит в консоль строку “Hello World!”.
         *
         * 3. Подключиться к GitHub, залить программу в созданный репозиторий.
         */
        System.out.println("ЗАДАЧА №1_Первая программа\n");

        System.out.println("Hello World");

        System.out.println("\n*************************\n");


        /** Задача №2_Типы данных
         Создание переменных:
         1. Создайте переменную типа с плавающей точкой с наибольшим диапазоном чисел. Присвойте ей произвольное дробное значение
         2. Создайте переменную целочисленного типа с наименьшим диапазоном чисел. Присвойте ей наибольшее возможное значение
         */
/*
        System.out.println("ЗАДАЧА №2_Типы данных\n");

        System.out.println("Переменная с плавающей точкой с наибольшим диапазоном чисел");

        System.out.println("Это: " + "double num = 1234567.12345");

        System.out.println("Переменная целочисленного типа с наименьшим диапазоном чисел");

        System.out.println("Это: " + "byte a = 127");

        double num = 1234567.12345;
        byte a = 127;
*/

        System.out.println("\n*************************\n");


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
/*
        System.out.println("ЗАДАЧА №3_Массивы\n");

        int[] array1 = {2, 5, 6, 8, 7};
        int d = array1[0];
        array1[0] = array1[array1.length - 1];
        array1[array1.length - 1] = d;
        System.out.println("Сумма первого и среднего элементов =  " + (array1[0] + array1[array1.length - 3]));

*/
        System.out.println("\n*************************\n");


        /** Задача №4_Операторы
         * 1. Ввести три числа с клавиатуры x, y, z
         *
         * 2. Найти и вывести в консоль среднее арифметическое этих чисел
         *
         * 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
         *
         * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

         */
/*
        System.out.println("ЗАДАЧА №4_Операторы\n");
        Scanner in = new Scanner(System.in);
        int x, y, z;
        int srAref;

        System.out.println("Введите поочередно три произвольных числа");

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        System.out.println("Вы ввели: " + x + " ," + y + " ," + z);
        srAref = (x + y + z) / 3;


        System.out.println("среднее арифметическое этих чисел");
        System.out.print("Результат: ");
        System.out.println((x + y + z) / 3);

        if ((srAref / 2) > 3) {
            System.out.println("Программа выполнена корректно");

        }

        System.out.println("\n*************************\n");

*/
        /** ЗАДАЧА №5_Операторы
         * Напишите простой калькулятор:
         *
         * 1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
         *
         * 2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
         */

        System.out.println("ЗАДАЧА №5_Операторы_Калькулятор\n");
        Scanner w = new Scanner(System.in);
        double f, g;
        int znak;

        System.out.println("Введите поочередно два произвольных числа");

        f = w.nextInt();
        g = w.nextInt();
        System.out.println("Введите знак арифметичского действия");
        znak = System.in.read();

        if (znak == '+') {
            System.out.println("Результат операции =  " + (f + g));
        } else if (znak == '-') {
            System.out.println("Результат операции =  " + (f - g));
        } else if (znak == '*') {
            System.out.println("Результат операции =  " + (f * g));
        } else if (znak == '/') {
            System.out.println("Результат операции =  " + (f / g));
        }


        System.out.println("\n*************************\n");



        /** ЗАДАЧА №6_Операторы_конвертер физических величин:
         * Напишите программу конвертер физических величин:
         *
         * 1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
         * > Выберите что переводить: 1 - масса, 2 - расстояние
         * > 2
         *
         * 2. Пользователю предлагается выбрать единицу измерения. Пример:
         * > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
         * > 1
         *
         * 3. Пользователю предлагается ввести количество выбранных единиц:
         * > Введите число
         * > 10
         * > Результат:
         * > Метры: 10
         * > Мили: 0.006
         * > Ярды: 10.94
         * > Футы: 32.81
         */

        System.out.println("ЗАДАЧА №6_Операторы_конвертер физических величин\n");
        Scanner ed = new Scanner(System.in);

        double kol;
        int vel, ad;


        System.out.println("Ввести массу или расстояние на выбор");
        System.out.println("Где масса - 1, расстояние - 2");

        vel = ed.nextInt();


        if (vel == 1) {
            System.out.println("Вы выбрали Массу, введите единицу измерения");
            System.out.println("Грамм - 1");
            System.out.println("Киллограмм - 2");
            System.out.println("Центнер - 3");
            System.out.println("Тонна - 4");

            ad = ed.nextInt();

            System.out.println("Введите колисчество, если дробное, то ставим запятую на вводе");

            kol = ed.nextDouble();
            System.out.println("Вы ввели " + kol);

            if (ad == 1) {
                System.out.println("Грамм: " + kol);
                System.out.println("Киллограмм: " + (kol / 1000));
                System.out.println("Центнер: " + (kol / 100000));
                System.out.println("Тонна: " + (kol / 1000000));
            } else if (ad == 2) {
                System.out.println("Грамм: " + (kol * 1000));
                System.out.println("Киллограмм: " + kol);
                System.out.println("Центнер: " + (kol / 100));
                System.out.println("Тонна: " + (kol / 1000));
            } else if (ad == 3) {
                System.out.println("Грамм: " + (kol * 100000));
                System.out.println("Киллограмм: " + (kol * 100));
                System.out.println("Центнер: " + kol);
                System.out.println("Тонна: " + (kol / 10));
            } else if (ad == 4) {
                System.out.println("Грамм: " + (kol * 1000000));
                System.out.println("Киллограмм: " + (kol * 1000));
                System.out.println("Центнер: " + (kol * 10));
                System.out.println("Тонна: " + kol);
            }


        } else if (vel == 2) {
            System.out.println("Вы выбрали Расстояние, введите единицу измерения");
            System.out.println("Метр - 1");
            System.out.println("Миля - 2");
            System.out.println("Ярд - 3");
            System.out.println("Фут - 4");

            ad = ed.nextInt();

            System.out.println("Введите колисчество, если дробное, то ставим запятую на вводе");

            kol = ed.nextDouble();
            System.out.println("Вы ввели " + kol);

            if (ad == 1) {
                System.out.println("Метр: " + kol);
                System.out.println("Миля: " + (kol * 62 / 100000));
                System.out.println("Ярд: " + (kol * 1.0936133));
                System.out.println("Фут: " + (kol * 3.2808399));
            } else if (ad == 2) {
                System.out.println("Метр: " + (kol * 1609.3440));
                System.out.println("Миля: " + kol);
                System.out.println("Ярд: " + (kol * 1760));
                System.out.println("Фут: " + (kol * 5280));
            } else if (ad == 3) {
                System.out.println("Метр: " + (kol * 0.9144));
                System.out.println("Миля: " + (kol * 0.56818 / 1000));
                System.out.println("Ярд: " + kol);
                System.out.println("Фут: " + (kol * 3));
            } else if (ad == 4) {
                System.out.println("Метр: " + (kol * 0.3048));
                System.out.println("Миля: " + (kol * 0.18939 / 1000));
                System.out.println("Ярд: " + (kol * 0.33333));
                System.out.println("Фут: " + kol);
            }


        } else
            System.out.println("Вы сделали неправильный выбор");


        System.out.println("\n*************************\n");


        /**Задача №7_Циклы
         Инструкция
         Напишите программу:

         1. Пользователь вводит размер массива и данные с клавиатуры в массив

         2. Сравнить элементы массива с заранее заданными константами x, y, z.

         3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
         */

        System.out.println("Задача №7_Циклы\n");

        Scanner od = new Scanner(System.in);
        System.out.println("Введите колисчество агрументов массива");
        int m = od.nextInt();
        int myArray[] = new int[m];

        int xx = 4;
        int yy = 5;
        int zz = 6;

        System.out.println("Вы ввели " + m);
        System.out.println("заполните массив аргументами ");

        for (int j = 0; j < m; j++) {
            int i = od.nextInt();
            myArray[j] = i;
        }
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + " ");
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == xx || myArray[i] == yy || myArray[i] == zz) {
                System.out.println("\nДанное значение имеется в константах");
                break;
            }

        }

        System.out.println("\n*************************\n");

        /**Задача №8_Циклы
         Инструкция
         Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
         */

        System.out.println("Задача №8_Циклы\n");


        Scanner cd = new Scanner(System.in);
        System.out.println("Введите колисчество агрументов массива");
        int n = cd.nextInt();
        int sym = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sym = sym + i;
                System.out.println("Нечетное Число до n " + i);
            }
        }
        System.out.println("Сумма нечетных чисел до n = " + sym);

        System.out.println("\n*************************\n");

        /**Задача №9_Циклы
         Инструкция
         Напишите программу:

         1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

         2. Посчитайте среднее арифметическое элементов массива.

         3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
         */

        System.out.println("Задача №9_Циклы\n");

        Scanner cyc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int k = cyc.nextInt();
        double[] CycleArray = new double[k];
        System.out.println("Введите аргументы массива");
        double srAr = 0;
        for (int i = 0; i < k; i++) {
            double t = cyc.nextDouble();
            CycleArray[i] = t;
        }
        for (int i = 0; i < CycleArray.length; i++) {
            srAr = srAr + CycleArray[i];

        }
        System.out.println("Среднеарифметиское элементов массива = " + (srAr / CycleArray.length));
        for (int i = 0; i < CycleArray.length; i++) {
            System.out.println("Новый массив  умноженный на сред.ареф " + (CycleArray[i] * (srAr / CycleArray.length)));
        }
        System.out.println("\n*************************\n");

        /**Задача №10_Циклы
         *         Инструкция
         *         Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
         *         а после этого произведите вывод первой строки матрицы на экран, где каждый
         *         элемент умножается на 3. Размерность матрицы задается пользователем.
         */

        System.out.println("Задача №10_Циклы\n");

        Scanner two = new Scanner(System.in);

        System.out.println("Введите количество строк массива");
        int e = two.nextInt();
        System.out.println("Введите количество столбцов массива");
        int u = two.nextInt();
        double[][] twoArray = new double[e][u];
        System.out.println("Введите аргументы массива");
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = two.nextDouble();
            }
        }

        for (int i = 0; i < twoArray[0].length; i++) {
            twoArray[0][i] = twoArray[0][i] * 3;
            System.out.print(twoArray[0][i] + " ");

        }

        System.out.println("\n*************************\n");

        /**Задача №11_Работа с данными
         Инструкция
         Напишите программу:

         1. Ввести первое число с клавиатуры и записать его в строковую переменную.

         2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.

         3. Сравнить 2 числа и вывести большее на экран

         4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
         */

        System.out.println("Задача №11_Работа с данными\n");

        Scanner h = new Scanner(System.in);
        System.out.println("Введите первое число целочисленное");

        String result1;
        int p=h.nextInt();
        result1=Integer.toString(p); //Переводим число в строковый тип данных
        System.out.println("Введите второе число целочисленное");
        int t=h.nextInt();
        //Math.max определяет максимальное число из двух; в скобках первое число парсится(вычитывается) и переводится в число(int)
        int max=Math.max(Integer.parseInt(result1),t);
        System.out.println("Максимальное значение из двух введенных " + max);
        //Math.min определяет минимальное число из двух; в скобках первое число парсится(вычитывается) и переводится в число(int)
        double min = Math.min(Integer.parseInt(result1),t);
        System.out.println("Минимальное значение из двух введенных " + min);


        System.out.println("\n*************************\n");

        /**Задача №12_Работа с данными
         Инструкция
         Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:


         1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).

         2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).

         3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).

         4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.

         5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
         */

        System.out.println("Задача №12_Работа с данными\n");

        String Stroka = "I like Java!!!";
//        Stroka.contains("Java");  проверяет, есть ли в строке данное выражение и возвращает истину или ложь
//        Stroka.startsWith("I like");
//        Stroka.endsWith("!!!");
        if (Stroka.contains("Java") && Stroka.startsWith("I like") && Stroka.endsWith("!!!")){
            System.out.println(Stroka.toUpperCase()); //переводит в строке все символы в верхний регистр
        }
        //далее на печать меняем символы "a" на  "о" оператором replace в части строки от до (получим слово Java)
        // с помощью substring, для этого
        //IndexOf находит в строке первый символ "J"; lastIndexOf в строке ищет последний символ "a"
        System.out.println(Stroka.replace ("a","o").substring(Stroka.indexOf("J"),(Stroka.lastIndexOf("a"))+1));

        System.out.println("\n*************************\n");

        /**
         * Задача №13_ Работа с данными
         * Инструкция
         * Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
         * Например: “I love java 8 Я люблю java 14 core1”.
         * Выполните следующие действия:
         *
         * 1. Выведите слова, состоящие только из латиницы.
         *
         * 2. Выведите количество этих слов.
         */

        System.out.println("Задача №13_ Работа с данными\n");

        System.out.println("Введите строку - I love java 8 Я люблю java 14 core1");
        int schet = 0;

        Scanner us = new Scanner(System.in);
        String StrUsRu = us.nextLine();//оператор ввода строки

        System.out.println("Cлова, состоящие только из латиницы");
        String[] StrMas = StrUsRu.split(" "); //помещает введенную строку в массив
        System.out.println(Arrays.toString(StrMas));//выводит массив на экран
        for (String i : StrMas) {                   // пробегает по каждому слову в массиве через операто fori
            if (i.matches("^[a-zA-Z]*$")) {    //i.matches проверяет каждое слово, соответствуют ли символы латинице
                schet++;                             // если слово латинское, то считает его. После чтения всего массива, увидем сколько латинских слов
                System.out.println(i);

            }

        }
        System.out.println("Количество слов на латинице = " + schet);

        System.out.println("\n*************************\n");

        /**Задача №14_ Работа с данными
         Инструкция
         Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:


         1. Выведите максимальный и минимальный элемент массива.

         2. Из максимального и минимального значения выведите наибольшее по модулю.
         */

        System.out.println("Задача №14_ Работа с данными\n");

        System.out.println("Задаем массив из 15 чисел от -20 до 20");

        int [] masRond = new int [15];                  //создаем массив из 15 чисел
        for (int i=0; i< masRond.length; i++) {
            masRond[i] = ((int)(Math.random() * 41) - 20); //с помощью оператора math.random заполняем массив рандомными числами
            // в диапозоне от -20 до +20, всего 41 число включая 0
            System.out.print(" " + masRond[i]);
        }

        System.out.println("\nВыводим отсортированный массив");
        Arrays.sort(masRond);                                           //сортирует массив от меньшего к большему
        System.out.println(Arrays.toString(masRond));
        int maxnum=masRond[masRond.length-1];                           //последнее число массива будет максимальным, выбираем его
        System.out.println("Максимальный элемент массива = " + maxnum);
        int minnum=masRond[0];
        System.out.println("Минимальное значение массива = " + minnum);
        if (Math.abs(maxnum)>Math.abs(minnum)) {                            //с math.abs определяем наибольшое число по модулю(т.е. не считая знака)
            System.out.println("Наибольшее занчение по модулю = " + maxnum);
        }
        else if (Math.abs(maxnum)<Math.abs(minnum)) {
            System.out.println("Наибольшее занчение по модулю = " + minnum);
        }
        else
            System.out.println("Максимальное и минимальное значения равны " + maxnum);

        System.out.println("\n*************************\n");

        /**Итоговая задача №1
         Инструкция
         Напишите программу конвертер валют.
         Программа должна переводить рубли в доллары по текущему курсу.
         Пользователь вводит текущий курс и количество рублей.
         Итоговое значение должно быть округлено до двух знаков после запятой.

         Пример для теста работы программы:

         - Курс доллара: 67,55
         - Количество рублей: 1000
         - Итого: 14,80 долларов
         */
        System.out.println("Итоговая задача №1\n");

        Scanner ug = new Scanner(System.in);
        System.out.println("Введите курс, если дробное используйте запятую");
        double kurs = ug.nextDouble();
        System.out.println("Введите сумму в рублях");
        int kolichestvo = ug.nextInt();
        System.out.printf("%s %.2f %s" , "Итого: " , kolichestvo/kurs , " $");

        System.out.println("\n*************************\n");

        /**Итоговая задача №2
         Инструкция
         Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
         Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
         Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.

         Нужно найти неизвестное.

         Пример для теста работы программы:

         - Ввод: x+5=7
         - Вывод: 2
         - Ввод: 3-x=9
         - Вывод: -6
         - Ввод: 3-3=x
         - Вывод: 0
         */

        System.out.println("Итоговая задача №2\n");

        System.out.println("Введите в строку уравнение типа x+y=z, " +
                "где Второй символ строки является знаком ‘+’ или ‘-’, " +
                "четвертый символ строки ‘=’.\n" +
                "Первым, третьим и пятым символом являются две цифры " +
                "(от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.");
        int a = 0, b = 0, c = 0;
        String x;

        //Scanner us = new Scanner(System.in);
        while (true) {

            String StrUr = us.nextLine();


            //далее создаем массив и парсим его его
            String[] masUr = StrUr.split("");
            if (masUr.length == 5) {
                System.out.println(Arrays.toString(masUr));

                if (masUr[0].equals("x")) {
                    x = (masUr[0]);
                } else a = Integer.parseInt(masUr[0]);
                if (masUr[2].equals("x")) {
                    x = masUr[2];
                } else b = Integer.parseInt(masUr[2]);
                if (masUr[4].equals("x")) {
                    x = masUr[4];
                } else c = Integer.parseInt(masUr[4]);

                if (masUr[0].equals("x") && masUr[1].equals("+")) {
                    System.out.println("Получили уравнение типа x+b=c\n Результат: " + (c - b));
                    break;
                } else if (masUr[0].equals("x") && masUr[1].equals("-")) {
                    System.out.println("Получили уравнение типа x-b=c\n Результат: " + (c + b));
                    break;
                } else if (masUr[2].equals("x") && masUr[1].equals("+")) {
                    System.out.println("Получили уравнение типа a+x=c\n Результат: " + (c - a));
                    break;
                } else if (masUr[2].equals("x") && masUr[1].equals("-")) {
                    System.out.println("Получили уравнение типа a-x=c\n Результат: " + (a - c));
                    break;
                } else if (masUr[4].equals("x") && masUr[1].equals("+")) {
                    System.out.println("Получили уравнение типа a+b=x\n Результат: " + (a + b));
                    break;
                } else if (masUr[4].equals("x") && masUr[1].equals("-")) {
                    System.out.println("Получили уравнение типа a-b=x\n Результат: " + (a - b));
                    break;
                }
            } else {
                System.out.println("введеное выражание не соответствует размеру уравнения");
            }
        }

        System.out.println("\n*************************\n");

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
        int l = 0;
        int s;
        String slovo = "";
        System.out.println("Введите количество строк массива");
        String stroki = Skaner.nextLine();
        String[] MassStroka = new String[Integer.parseInt(stroki)];
        System.out.println("Введите аргументы массива");
        for (int i = 0; i < MassStroka.length; i++) {

            MassStroka[i] = Skaner.nextLine();
        }
        for (int i = 0; i < MassStroka.length; i++) {

            System.out.println("Строка " + (i + 1) + ": " + MassStroka[i]);
        }
        for (int i = 0; i < MassStroka.length; i++) {
            s = (int) MassStroka[i].chars().distinct().count();

            if (s > l) {
                slovo = MassStroka[i];
                l = s;
            }
        }
        System.out.println("Строка с максимальным количеством различных символов " + slovo);
        }


    }

