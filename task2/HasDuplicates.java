import java.util.*;

public class HasDuplicates{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String inp = in.nextLine();
        String[] nums = inp.split(", ");
        System.out.println(isHasDuplicates(nums));
        in.close();
    }
    public static boolean isHasDuplicates(String[] nums){
        if (nums.length == 0 ){
            return false;
        }
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i].equals(nums[j])){
                    return true;
                }
            }
        }
        return false;
    }
}