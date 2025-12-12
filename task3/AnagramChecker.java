import java.util.Scanner;
import java.util.Arrays;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] strings = inp.split(",");
       
        String str1 = strings[0].trim();
        String str2 = strings[1].trim();
        
        System.out.println(isAnagram(str1, str2));
        
        in.close();
    }
        public static boolean isAnagram(String str1, String str2) {
            String s1 = str1.toLowerCase();
            String s2 = str2.toLowerCase();
            
            if (s1.length() != s2.length()) {
                return false;
            }
            
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();
            
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            
            return Arrays.equals(charArray1, charArray2);
        }
}
