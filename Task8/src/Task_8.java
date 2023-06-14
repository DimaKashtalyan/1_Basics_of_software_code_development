//Найти max{min(a, b), min(c, d)}
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение переменной a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение переменной b: ");
        int b = scanner.nextInt();

        System.out.print("Введите значение переменной c: ");
        int c = scanner.nextInt();

        System.out.print("Введите значение переменной d: ");
        int d = scanner.nextInt();

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int max = Math.max(min1, min2);

        System.out.println("Максимальное значение: " + max);
    }
}