 public class RectanglePattern{

    public static void main(String[] args) {
        
       for(int i = 1; i<=4; i++){
        for(int s = 3; s>=i; s--){
            System.out.print(" ");
        }
        for(int j = 1; j<=5; j++){
            System.out.print("*");
        }
        System.out.println("");
       }
    }
 }