import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(getSum(num));
        in.close();
    }
    public static int getSum(int num){
        int sumOfDig = 0;
        while (num != 0) {
            sumOfDig += (num % 10);
            num /= 10;
        }
        return sumOfDig;
    }
    
    
}

