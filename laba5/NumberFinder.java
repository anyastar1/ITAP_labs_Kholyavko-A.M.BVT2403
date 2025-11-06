package laba5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class NumberFinder { public static void main(String[] args) {
        try {
            String text = "The price of the product is $19.99, there are 25 items, and temperature is -3.5 degrees";
            Pattern pattern = Pattern.compile("-?\\d+(?:\\.\\d+)?");
            Matcher matcher = pattern.matcher(text);
            
            System.out.println("Найденные числа:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка в синтаксисе: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}

