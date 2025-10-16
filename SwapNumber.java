
import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Before Number a =" + a + ",b =" + b);
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("After Number a = " + a + ",b =" + b);

    }
}
