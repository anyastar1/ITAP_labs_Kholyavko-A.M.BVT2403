import java.util.*;

public class EvenOrNot{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isEven(num));
        in.close();
    }
    public static boolean isEven(int num){
        if (num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}