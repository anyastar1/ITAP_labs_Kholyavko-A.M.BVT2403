import java.util.*;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] sentence = inp.split(" ");
        System.out.println(getReverseWords(sentence));
        in.close();
    
    }
    public static String getReverseWords(String[] sentence){
        StringBuilder reversed = new StringBuilder();
        for(int i = sentence.length - 1; i >= 0; i--){
            reversed.append(sentence[i]);
            if (i > 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();

    }
    
    
}
