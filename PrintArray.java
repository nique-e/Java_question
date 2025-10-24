public class PrintArray{

    public static void main(String[] args) {
        String names[] = {"Nitersh", "Rushi", "Sahil", "Kunal", "Shailesh"};
        System.out.print("index |" +"names");
        System.out.println("");

        for(int i = 0; i<names.length; i++){
            System.out.println(i+ " |" +names[i]);
        }
       
    }
}