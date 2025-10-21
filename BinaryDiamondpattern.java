 public class BinaryDiamondpattern{

    public static void main(String[] args) {
        
        for(int i = 1; i<=3; i++){
            for(int s = 3; s>i; s--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                if(i%2==0){
                    System.out.print(" 0");
                }
                else{
                    System.out.print(" 1");
                }
            }
            System.out.println("");
        }
    }
 }