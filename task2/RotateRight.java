import java.lang.reflect.Array;
import java.util.*;

public class RotateRight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();

        String[]part = inp.split("\\], ");
        String partFirsts = part[0].substring(1);
        int k = Integer.parseInt(part[1]);

        int[] arr;
        if (partFirsts.isEmpty() || partFirsts.equals("")) {
            arr = new int[0];
        } else {
            String[] part1 = partFirsts.split(", ");
            arr = new int[part1.length];
            for (int i = 0; i < part1.length; i++) {
                arr[i] = Integer.parseInt(part1[i]);
            }
        }
        
        int[] result = isRotateRight(arr, k);
        System.out.println(Arrays.toString(result));

        in.close();
    }

    public static int[] isRotateRight(int[] arr, int k){
        if (arr.length == 0){
            return new int[0];
        }

        int shift = k % arr.length;
        if (shift == 0){
            return arr.clone();
        }

        int[] result =  new int[arr.length];

        for (int i=0; i < arr.length; i++){
            int newIndex = (i + shift) % arr.length;
            result[newIndex] = arr[i];
        }
        return result;
    }
    
}
