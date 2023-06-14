//Найти сумму квадратов первых ста чисел.

public class Task_14 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Сумма квадратов первых " + n + " чисел: " + sum);
    }
}
