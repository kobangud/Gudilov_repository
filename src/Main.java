import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

       /** char ch, answer = 'B';

        System.out.println("Попытайтесь угадать букву");
        System.out.print("Буква: ");

        ch = (char) System.in.read();


        if (ch == 'B') {
            System.out.println("Урра, вы угадали букву!!! ");
        } else if (ch < 'B') {
            System.out.println("Недостарались, попробуйте еще ");
        } else
            System.out.println("Перестарались =((( ");
        */

       int monthNum ;

        /*
        Попробовал через консоль ввода, не вышло. Выводит почему то дефолт.
        System.out.println("Введите порядклвый номер месяца");
        System.out.print("Месяц: ");
        monthNum = (int) System.in.read();
        */

        monthNum = 8;
       String NameMonth;

       switch (monthNum){
           case 1:NameMonth = "Январь";
                break;
           case 2:NameMonth = "Февраль";
               break;
           case 3:NameMonth = "Март";
               break;
           case 4:NameMonth = "Апрель";
               break;
           case 5:NameMonth = "Май";
               break;
           case 6:NameMonth = "Июнь";
               break;
           case 7:NameMonth = "Июль";
               break;
           case 8:NameMonth = "Август";
               break;
           case 9:NameMonth = "Сентябрь";
               break;
           case 10:NameMonth = "Октябрь";
               break;
           case 11:NameMonth = "Ноябрь";
               break;
           case 12:NameMonth = "Декабрь";
               break;
           default: NameMonth = "Нет такого месяца";


       }
        System.out.println("Месяц: " + NameMonth);

    }
}