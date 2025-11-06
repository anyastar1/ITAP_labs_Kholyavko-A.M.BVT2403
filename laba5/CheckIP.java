package laba5;
import java.util.regex.*;
import java.util.Scanner;

public class CheckIP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        String ipAddress = in.nextLine();
        
        try {
            Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Matcher matcher = pattern.matcher(ipAddress);
            
            if (matcher.matches()) {
                System.out.println("IP-адрес корректен!");
            } 
            else {
                System.out.println("IP-адрес некорректен");
                System.out.println("Должен состоять из 4 чисел, разделенных точками");
                System.out.println("Каждое число должно быть в диапазоне от 0 до 255");
            }
            
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка в регулярном выражении: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
