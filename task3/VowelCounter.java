import java.util.Scanner;

public class VowelCounter {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        System.out.println(countVowels(inp));
        in.close();
    }
    public static int countVowels(String inp) {
        int count = 0;
        String lowCase = inp.toLowerCase();
        
        for (int i = 0; i < lowCase.length(); i++) {
            char letter = lowCase.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
