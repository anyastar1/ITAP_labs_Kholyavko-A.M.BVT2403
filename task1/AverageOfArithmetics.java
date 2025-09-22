import java.util.*;

public class AverageOfArithmetics{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(average(num1,num2,num3));
        in.close();
    }
    public static double average( int num1, int num2, int num3){
        double avrsum = ( num1 + num2 + num3)/3;
        return avrsum;
    }
}
