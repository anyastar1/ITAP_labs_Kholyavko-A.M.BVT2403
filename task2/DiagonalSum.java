import java.util.Scanner;

public class DiagonalSum {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        
        inp = inp.replaceAll("\\[|\\]", ""); 
        String[] rows = inp.split(",\\s*");
            
        int n = (int)Math.sqrt(rows.length);
        int[][] matrix = new int[n][n];
            
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(rows[i * n + j].trim());
            }
        }
        System.out.println(diagonalSum(matrix));
        
        in.close();
    }
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    
}
