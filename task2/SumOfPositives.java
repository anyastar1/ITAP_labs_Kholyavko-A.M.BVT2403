import java.util.*;

public class SumOfPositives {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] nums = inp.split(", ");
        System.out.println(isSumOfPositive(nums));
        in.close();
    }
    public static int isSumOfPositive(String[] nums){
        int sum = 0;
        for ( int i = 0; i < nums.length; i++){
            int num1 = Integer.parseInt(nums[i]);
            if ( num1 > 0) {
                sum += num1;
            }
        }
        return sum;

    }
}
