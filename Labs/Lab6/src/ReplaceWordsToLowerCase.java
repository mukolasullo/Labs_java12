// Завдання 11: Замінити всі слова у реченні малими літерами
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceWordsToLowerCase {
    // Метод для перетворення слів у малий регістр
    public static String replaceWordsToLowerCase(String sentence) {
        if (sentence == null) {
            throw new NullPointerException("Input sentence cannot be null.");
        }
        Pattern pattern = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher matcher = pattern.matcher(sentence);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toLowerCase());
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public static void main(String[] args) {
        // Тестові приклади
        String input = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        System.out.println(replaceWordsToLowerCase(input));
        // Очікуваний результат: "the user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago"

        // Перевірка некоректних даних
        try {
            System.out.println(replaceWordsToLowerCase(null));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); // Очікуваний результат: повідомлення про помилку
        }
    }
}
