
/*
Задание 1
Исходные данные программы:

имя
отчество
фамилия
Создайте переменные для этих данных. После чего сформируйте строке вида:

Николай Иванович Петров (Н.И. Петров)
Copy
Подсказка: что бы получить инициалы, используйте charAt как мы делали на занятие



Задание 2
Обратная задача. Исходные данные программы: строка вида

Николай Иванович Петров
Copy
Написать программу, которая рахбирает строку на три переменные:

имя
отчество
фамилия
Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf и substring()


*/


// Oleksandr Potetiuiev  COHORT89M

public class Main {
    public static void main(String[] args) {
        String name = "Николай";
        String name2 = "Иванович";
        String name3 = "Петров";

        String final0 = name+ " " + name2 + " "  + name3 + " (" + name.charAt(0) + ". " + name2.charAt(0) + ". " + name3+ ")";
        System.out.println(final0);


        //   Задание 2 Использую строку из Задание 1 (final0)

        int normStringIndex = final0.lastIndexOf('(');
        String normString = final0.substring(0, normStringIndex - 1);


        int firstSpace = normString.indexOf(" ");
        int lastSpace = normString.lastIndexOf(" ");

        System.out.println(normString);

        String name1S = normString.substring( 0, firstSpace);
        String name2S = normString.substring(firstSpace + 1, lastSpace);
        String name3S = normString.substring(lastSpace + 1);


        System.out.println("имя: " +name1S);
        System.out.println("отчество: " +name2S);
        System.out.println("фамилия: " +name3S);


    }
}