import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        System.out.println(isGrade(grade));
        in.close();
    }

    public static String isGrade(int grade){
        if (90 <= grade && grade <= 100){
            return "A";
        }
        if (80 <= grade && grade <= 89){
            return "B";
        }
        if (70 <= grade && grade <= 79){
            return "C";
        }
        if (60 <=grade && grade <= 69){
            return "D";
        }
        if (0 <= grade && grade <= 59){
            return "F";
        }
        return "Invalid";
    }
}
