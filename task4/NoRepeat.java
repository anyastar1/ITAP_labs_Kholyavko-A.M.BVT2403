import java.util.Scanner;

public class NoRepeat {
    
    public static String noRepeat(String s) {
        if (s == null || s.length() < 4) {
            return s;
        }
        
        String lowerS = s.toLowerCase();
        int[] frequency = new int[256]; 
        
        for (int i = 0; i < s.length(); i++) {
            char c = lowerS.charAt(i);
            frequency[c]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = lowerS.charAt(i);
            
            if (frequency[currentChar] > 3) {
                StringBuilder newStr = new StringBuilder();
                char charToRemove = s.charAt(i);
                String charToRemoveLower = String.valueOf(charToRemove).toLowerCase();
                
                for (int j = 0; j < s.length(); j++) {
                    String currentCharStr = String.valueOf(s.charAt(j)).toLowerCase();
                    if (!currentCharStr.equals(charToRemoveLower)) {
                        newStr.append(s.charAt(j));
                    }
                }
                
                return noRepeat(newStr.toString());
            }
        }
        
        return s;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(noRepeat(input));
        scanner.close();
    }
}