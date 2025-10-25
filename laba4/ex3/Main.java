package laba4.ex3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Проверка возраста");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите число 0 или 1");
                continue;
            }

            switch (choice) {
                case 1 -> AgeExample.run();
                case 0 -> {
                    System.out.println("Выход");
                    return;
                }
                default -> System.out.println("Неверный пункт меню");
            }
        }
    }
}