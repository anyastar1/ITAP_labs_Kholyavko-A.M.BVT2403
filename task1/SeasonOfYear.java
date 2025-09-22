import java.util.*;

public class SeasonOfYear{
    public static void main( String [] args){   
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        System.out.println(season(month));
    }
    public static String season(int month){
        if (month == 1 || month == 2 || month == 12){
            return "зима";
        }
        else if ( month >=3 && month <= 5){
            return "весна";
        }
        else if (month >= 6 && month <= 8){
            return "лето";
        }
        else if(month >=9 && month <=11){
            return "осень";
        }
        return "введите число от 1 до 12";
    }
}