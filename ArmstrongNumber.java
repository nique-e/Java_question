
import java.util.Scanner;

public class ArmstrongNumber{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while(num>0){
            int rem = num % 10;
            sum = sum +(rem * rem * rem);
            num = num /10;
        }

        if(original == sum){
            System.out.println("the armstong number :" +original );
        }
        else{
            System.out.println("Not armstong number : " +original);
        }
    }
}