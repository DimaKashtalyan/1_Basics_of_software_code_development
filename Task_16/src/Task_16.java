//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е.
import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число e: ");
        double e = scanner.nextDouble();
        int n = 1;
        double sum = 0;

        while (true) {
            double step = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);

            if (Math.abs(step) >= e) {
                sum += step;
                n++;
            } else {
                break;
            }
        }
        System.out.println("Сумма членов ряда: " + sum);
    }
}
