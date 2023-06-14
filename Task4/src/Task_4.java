//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число R вида nnn.ddd: ");
        double R = scanner.nextDouble();

        int wholePart = (int) R;
        double fractionalPart = R - wholePart;

        double swappedNumber = (fractionalPart * 1000) + wholePart / 1000.0;

        DecimalFormat df = new DecimalFormat("#.###");
        String result = df.format(swappedNumber);

        System.out.println("Полученное значение числа: " + result);
    }
}