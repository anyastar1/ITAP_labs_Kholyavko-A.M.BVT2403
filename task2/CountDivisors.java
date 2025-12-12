import java.util.*;

public class CountDivisors{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(numOfDivisors(num));
        in.close();
    }
    public static int numOfDivisors(int num){
        int count = 0;

        if (num <= 0){
            return 0;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 ){
                count++;
            }
        }
        return count;
    }
}