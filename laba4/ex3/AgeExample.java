package laba4.ex3;
public class AgeExample {
    public static void run() {
        try {
            int age = 150;
            if (age < 0 || age > 120)
                throw new CustomAgeException("Недопустимый возраст: " + age);
            System.out.println("Возраст корректный: " + age);
        } catch (CustomAgeException e) {
            ExceptionLogger.log(e);
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

