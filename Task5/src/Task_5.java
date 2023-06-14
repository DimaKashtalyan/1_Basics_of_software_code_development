//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение длительности времени в секундах: ");
        int T = scanner.nextInt();

        int hours = T / 3600; // количество часов
        int minutes = (T % 3600) / 60; // количество минут
        int seconds = (T % 3600) % 60; // количество секунд

        System.out.printf("Длительность времени: %02dч %02dмин %02dс", hours, minutes, seconds);
    }
}