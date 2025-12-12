import java.util.Scanner;
import java.util.Arrays;

public class DiffMaxMin{ 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String newInp = inp.replace("[", "").replace("]", "").replace(" ", "");
        String[] arrayInp = newInp.split(",");
        int[] num = new int[arrayInp.length];
        
        for (int i = 0; i < arrayInp.length; i++) {
                num[i] = Integer.parseInt(arrayInp[i]);
            }
        System.out.println(difference(num));
        in.close();
    }
    public static int difference(int[] num) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int value : num) {
            if (value > largest) {
                largest = value;
            }
            if (value < smallest) {
                smallest = value;
            }
        }
        return largest - smallest;
    }
}
