//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ширину отверстия А: ");
        int A = scanner.nextInt();
        System.out.print("Введите высоту отверстия В: ");
        int B = scanner.nextInt();

        System.out.print("Введите ширину кирпича x: ");
        int x = scanner.nextInt();
        System.out.print("Введите высоту кирпича y: ");
        int y = scanner.nextInt();
        System.out.print("Введите глубину кирпича z: ");
        int z = scanner.nextInt();

        boolean canPassThrough = checkPassThrough(A, B, x, y, z);

        if (canPassThrough) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }
    }

    private static boolean checkPassThrough(int A, int B, int x, int y, int z) {

        if ((x <= A && y <= B) || (y <= A && x <= B)) {
            return true;
        }

        if ((x <= A && z <= B) || (z <= A && x <= B)) {
            return true;
        }

        if ((y <= A && z <= B) || (z <= A && y <= B)) {
            return true;
        }

        return false;
    }
}
