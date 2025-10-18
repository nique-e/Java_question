
public class Prime1to100 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                    // System.out.print(i);

                }
            }
        
            if(isPrime == true){
                System.out.println(i);
            }
        }

    }
}
