import java.util.*;
public class SumRange{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] nums = inp.split(", ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        if (num1 <= num2) {
            System.out.println(isSumOfRange(num1, num2));
        }
        else {
            System.out.println("try again!");
        }
        
        in.close();
    }

    public static int isSumOfRange(int num1, int num2){
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }
    
    
}
