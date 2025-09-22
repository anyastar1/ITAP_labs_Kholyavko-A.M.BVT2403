import java.util.*;

public class DaysOfWeek{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(daysOfWeeks(num));
        in.close();
    }
    public static String daysOfWeeks(int num) {
        int balance = num%7;
        int num1 = num/7;
        String day;
        String week;
        if (balance >= 2 && balance <= 4){
             day = balance + " дня ";
        }
        else if ((balance >= 5 && balance <=6 )|| balance == 0){
             day = balance + " дней ";
        }
        else{
             day = balance + " день ";
        }
        if ( num1 % 10 >= 2 && num1 % 10 <= 4){
            week = num1+ " недели ";
        }
        else if ( num1 % 10 == 1){
             week = num1 + " неделя ";
        }
        else {
             week = num1 + " недель ";
        }
        return week + "и " + day;
    }   
}