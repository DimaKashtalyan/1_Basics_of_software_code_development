//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый угол треугольника: ");
        double angle1 = scanner.nextDouble();

        System.out.print("Введите второй угол треугольника: ");
        double angle2 = scanner.nextDouble();

        boolean exists = checkTriangleExistence(angle1, angle2);

        if (exists) {
            boolean isRightTriangle = checkRightTriangle(angle1, angle2);
            if (isRightTriangle) {
                System.out.println("Треугольник является прямоугольным.");
            } else {
                System.out.println("Треугольник не является прямоугольным.");
            }
        } else {
            System.out.println("Треугольник не существует.");
        }
    }

    private static boolean checkTriangleExistence(double angle1, double angle2) {
        double angle3 = 180 - angle1 - angle2;
        return angle3 > 0;
    }

    private static boolean checkRightTriangle(double angle1, double angle2) {
        return angle1 == 90 || angle2 == 90 || (180 - angle1 - angle2) == 90;
    }
}
