// Завдання 1: Перетворення int у шістнадцяткову строку
public class IntToHexString {
    // Метод для перетворення числа у шістнадцяткову строку
    public static String intToHexString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        return Integer.toHexString(i).toUpperCase();
    }

    public static void main(String[] args) {
        // Тестові приклади
        System.out.println(intToHexString(51966)); // Очікуваний результат: "CAFE"


        // Перевірка некоректних даних
        try {
            System.out.println(intToHexString(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Очікуваний результат: повідомлення про помилку
        }
    }
}