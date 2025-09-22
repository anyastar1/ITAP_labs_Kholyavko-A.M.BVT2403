public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        
            if (isPalindrome(args[i])==true){
                System.out.println(args[i] + " - палиндром");
            }
            else {
                System.out.println (args[i] + " - не палиндром");
            }
        
        }
    }
    public static String reverseString(String s){
        String RevStr = "";
        for ( int index = s.length()-1; index >= 0; index--){
            RevStr = RevStr + s. charAt (index);
        }
        return RevStr;
    }
    public static boolean isPalindrome(String s){
        String newstr = reverseString(s);
        if (s.equals(newstr)){
            return true;
        }
        return false;
    }
}
