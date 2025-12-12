import java.util.*;
public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int num = Math.abs(in.nextInt());
        String numStr = Integer.toString(num);
        System.out.println(countOfNums(numStr));
        in.close();
    }
    public static String countOfNums(String numStr){
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        return evenCount + ", " + oddCount;
    }
}
