import java.util.Scanner;
public class CountWords {
    public static int countWords(String inp) {
        if (inp == null || inp.isEmpty()) {
            return 0;
        }
        String trimmed = inp.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        String[] words = trimmed.split("\\s+");
        return words.length;
    }
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String inp = in.nextLine();
        System.out.println(countWords(inp));
        in.close();
    }
}