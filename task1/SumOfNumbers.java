import java.util.*;

public class SumOfNumbers{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(digitSum(num));
        in.close();
    }
    public static int digitSum(int num){
        int summa = 0;
       while (num > 0){
           summa += num % 10;
           num /= 10;
       } 
       return summa;
    }
}