import java.util.*;

public class MergeUniqueSorted{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String[] arrays = inp.split("\\], \\[");
        
        String array1Str = arrays[0].replace("[", "");
        int[] array1 = parseArray(array1Str);
        
        String array2Str = arrays[1].replace("]", "");
        int[] array2 = parseArray(array2Str);
        
        int[] result = mergeUniqueSorted(array1, array2);
        System.out.println(arrayToString(result));
        
        in.close();
    }
    
    private static int[] parseArray(String input) {
        String cleaned = input.replaceAll(" ", "");
        if (cleaned.isEmpty()) return new int[0];
        
        String[] parts = cleaned.split(",");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    
    public static int[] mergeUniqueSorted(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }
    
    private static String arrayToString(int[] array) {
        if (array.length == 0) return "[]";
        
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}