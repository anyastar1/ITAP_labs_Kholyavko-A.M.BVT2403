import java.util.*;
public class Clamp {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    String inp = in.nextLine();
    String[] nums = inp.split(", ");

    System.out.println(isClamp(nums));
    in.close();
   } 

   public static int isClamp(String[] nums){
    int value = Integer.parseInt(nums[0]);
    int min = Integer.parseInt(nums[1]);
    int max = Integer.parseInt(nums[2]);
    if ( value < min ){
        return min;
    }
    if ( value > max ){
        return max;
    }
    return value;
   }
}
