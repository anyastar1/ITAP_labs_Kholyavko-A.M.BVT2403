import java.util.*;

public class RectangleArea{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double width = in.nextDouble();
        double height = in.nextDouble();
        System.out.println(rectangleArea(width,height));
        in.close();
    }
    
    public static double rectangleArea(double width, double height){
        double area = width * height;
        return area;
    }
}