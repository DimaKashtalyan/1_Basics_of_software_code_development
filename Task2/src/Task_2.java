//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();

        double result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение выражения: " + result);
    }
}
