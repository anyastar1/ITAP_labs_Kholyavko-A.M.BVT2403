package laba5;

import java.util.regex.*;
import java.util.Scanner;

public class WordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Введите текст: ");
            String text = scanner.nextLine();
            
            System.out.print("Введите букву для поиска: ");
            String input = scanner.nextLine();
            
            char letter = input.charAt(0);
            String lowerLetter = String.valueOf(Character.toLowerCase(letter));
            String upperLetter = String.valueOf(Character.toUpperCase(letter));
    
            String regex = "(^|\\s)[" + lowerLetter + upperLetter + "][а-яА-ЯёЁa-zA-Z0-9]*";
            
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            
            System.out.println("Слова, начинающиеся с буквы '" + letter + "':");
            boolean found = false;
            
            while (matcher.find()) {
                String word = matcher.group().trim(); 
                System.out.println(word);
                found = true;
            }
            
            if (!found) {
                System.out.println("Слова, начинающиеся с буквы '" + letter + "', не найдены.");
            }
            
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
