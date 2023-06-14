//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение m: ");
        int m = scanner.nextInt();

        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();

        if (m <= n) {
            for (int i = m; i <= n; i++) {
                System.out.print("Делители числа " + i + ": ");
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Значение m не может быть больше n");
        }
    }
}
