
import java.util.Scanner;

public class LargestNumber{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first Number :");
        int a = sc.nextInt();

        System.out.println("Enter a second Number :");
        int b = sc .nextInt();
        
        if(a>b){
            System.out.println("a is largest number :" +a);
        }
        else{
            System.out.println("b is largest number :" +b);
        }
    }
}