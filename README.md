import java.util.Scanner;
public class Main {
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        System.out.print("Введите значение c: ");
        int c = scanner.nextInt();

        int z = ((a - 3) * b / 2) + c;
        System.out.println("Значение функции z: " + z);
    }
}
