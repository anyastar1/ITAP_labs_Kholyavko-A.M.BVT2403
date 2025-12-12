import java.util.Scanner;

public class DigHist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  
        int[] cnt = new int[10];   

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                cnt[c - '0']++;       
            }
        }
        
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(cnt[i]);
            if (i < 9) System.out.print(",");
        }
        System.out.println("]");
    }
}
