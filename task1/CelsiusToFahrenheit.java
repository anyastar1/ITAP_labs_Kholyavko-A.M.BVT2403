import java.util.*;

public class CelsiusToFahrenheit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int degreeC = in.nextInt();
        System.out.println(toFahrenheit(degreeC));
        in.close();
    }
    
    public static double toFahrenheit(int degreeC){
        double degreeF = degreeC * 9/5 + 32;
        return degreeF;
    }
}