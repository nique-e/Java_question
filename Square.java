
import java.util.Scanner;

public class Square{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");

        int a = sc.nextInt();
        int square ;

        square = a * a;

        System.out.println("The Square number :" +square);


    }
}