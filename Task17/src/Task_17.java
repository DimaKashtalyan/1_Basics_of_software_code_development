//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
public class Task_17 {
    public static void main(String[] args) {
        String input = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        for (char c : input.toCharArray()) {
            int numericValue = Character.getNumericValue(c);
            System.out.println("Символ: " + c + ", Численное обозначение: " + numericValue);
        }
    }
}
