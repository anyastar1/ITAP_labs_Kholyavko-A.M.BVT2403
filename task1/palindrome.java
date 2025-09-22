import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String word =in.nextLine();
        System.out.println(isPalindrome(word));
        in.close();
        
    }
    public static String reverseString(String word){
        String RevStr = "";
        for ( int index = word.length()-1; index >= 0; index--){
            RevStr = RevStr + word.charAt (index);
        }
        return RevStr;
    }
    public static boolean isPalindrome(String word){
        String newstr = reverseString(word);
        if (word.equals(newstr)){
            return true;
        }
        return false;
    }
}
