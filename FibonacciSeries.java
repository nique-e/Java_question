
import java.util.Scanner;

public class FibonacciSeries{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");

        
        int num = sc.nextInt();
        int frist = 0;
        int second = 1;

        for(int i = 1 ; i<=num; i++){
            int next = frist + second;
            frist = second;
            second = next;
           System.out.print(frist + " ");
        }
        
    }
}