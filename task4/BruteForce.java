import java. util.Arrays;
import java.util. Scanner;

public class Vernam {
    
    public static int[] decode(String text, String key) {
        int[] result = new int[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            int textChar = text.charAt(i);
            int keyChar = key.charAt(i);
            result[i] = textChar ^ keyChar;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        
        // Считываем строку в формате "MTUCI","MKIIT"
        String input = scanner.nextLine();
        
        // Разбиваем по ","
        String[] parts = input.split("\",\"");
        
        // Убираем оставшиеся кавычки
        String text = parts[0].replace("\"", "");
        String key = parts[1].replace("\"", "");
        
        int[] result = decode(text, key);
        
        System.out.println(Arrays.toString(result));
        
        scanner.close();
    }
}