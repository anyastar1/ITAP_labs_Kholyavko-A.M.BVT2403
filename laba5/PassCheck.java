package laba5;

import java.util.regex.*;
import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try {
            System.out.print("Введите пароль: ");
            String password = in.nextLine();
            String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
            
            if (password.matches(regex)) {
                System.out.println("Пароль корректен!");
            } else {
                System.out.println("Пароль не соответствует требованиям:");
                System.out.println(" Должен содержать только латинские буквы и цифры");
                System.out.println(" Длина от 8 до 16 символов");
                System.out.println(" Должна быть хотя бы одна заглавная буква");
                System.out.println(" Должна быть хотя бы одна цифра");
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