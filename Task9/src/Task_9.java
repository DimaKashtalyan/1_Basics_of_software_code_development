//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координату y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координату x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координату y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Введите координату x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите координату y3: ");
        double y3 = scanner.nextDouble();

        boolean areLieOnLine = checkLieOnLine(x1, y1, x2, y2, x3, y3);

        if (areLieOnLine) {
            System.out.println("Точки расположены на одной прямой.");
        } else {
            System.out.println("Точки не расположены на одной прямой.");
        }
    }

    private static boolean checkLieOnLine(double x1, double y1, double x2, double y2, double x3, double y3) {

        double NaklonAB = (y2 - y1) / (x2 - x1);

        double NaklonBC = (y3 - y2) / (x3 - x2);

        return NaklonAB == NaklonBC;
    }
}
