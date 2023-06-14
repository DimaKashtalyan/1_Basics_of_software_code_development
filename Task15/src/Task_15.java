//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task_15 {
    public static void main(String[] args) {
        int n = 200;
        long result = 1;

        for (int i = 1; i <= n; i++) {
            long square = (long) i * i;
            result *= square;
            System.out.println("Произведение квадратов первых " + n + " чисел: " + result);
        }
    }
}