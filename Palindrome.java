
import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num = sc.nextInt();
        int original = num;
        int  sum = 0;

        while(num>0){
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }

        if(original == sum ){
            System.out.println("the Palindrome number :" +original);
        }
        else{
            System.out.println("not Palindrome number :" +original);
        }
    }
}