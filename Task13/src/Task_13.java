//Вычислить значения функции на отрезке [а,b] c шагом h:
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало отрезка a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите конец отрезка b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите шаг h: ");
        double h = scanner.nextDouble();

        for (double x = a; x <= b; x += h) {
            double y;
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }

            System.out.println("x = " + x + ", y = " + y);
        }
    }
}