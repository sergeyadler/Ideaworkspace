package com.company;


import jdk.nashorn.tools.ShellFunctions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int unknownNumber = 0;
        int userNumber = 0;
        int tryCount = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("ИГРА : УГАДАЙ ЧИСЛО ");
        System.out.println("Задача угадать число от 1 до 100");

        unknownNumber = (int) Math.floor(Math.random() * 100);

        do {
            tryCount++;
            System.out.println("Введите число :  ");
            userNumber = scanner.nextInt();

            if (unknownNumber > userNumber)
                System.out.println("Вы не угадали, попробуйте еще раз! Мое число больше");
            else if (unknownNumber < userNumber)
                System.out.println("Вы не угадалиб попробуйте еще раз! Мое число меньше");
            else

                System.out.println("ВЫ выиграли поздравляю!");

        } while (userNumber != unknownNumber);

        System.out.println("Количество попыток: " + tryCount);
    }
}
