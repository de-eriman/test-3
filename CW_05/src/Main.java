//
//Задача 2
//        Напишите программу, которая просит пользователя ввести строку и 1 символ. Ввша программа должна считать, сколько раз заданный символ встречается во введенной строке
//
//        Например:
//
//        hello java
//        a
//
//        результат: 2


// Oleksandr Potetiuiev  COHORT89M

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        System.out.println("символ:");
        String inputChar = scanner.nextLine();

        if (inputChar.length() != 1) {
            System.out.println("ошибка");
            return;
        }

        char symbol = inputChar.charAt(0);
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == symbol) {
                count++;
            }
        }

        System.out.println("результат: " + count);

    }
}