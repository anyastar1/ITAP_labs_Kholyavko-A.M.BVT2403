package laba5;
import java.util.regex.*;

public class CapsFinder {
    public static void main(String[] args) {
        try {
            String text = "helloWorld thisIsATest javaProgramming";
            Pattern pattern = Pattern.compile("[a-z][A-Z]");
            Matcher matcher = pattern.matcher(text);
            StringBuffer result = new StringBuffer();
            
            while (matcher.find()) {
                String replacement = "!" + matcher.group() + "!";
                matcher.appendReplacement(result, replacement);
            }
            matcher.appendTail(result);
            
            System.out.println("Исходный текст: " + text);
            System.out.println("Результат: " + result.toString());
            
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка в регулярном выражении: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}