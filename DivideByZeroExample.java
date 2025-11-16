public class DivideByZeroExample {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;   // this will cause divide by zero

            int result = a / b; 
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide a number by zero!");
        }

        System.out.println("Program continues normally...");
    }
}
