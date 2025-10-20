public class LinearSearch1{

    public static void main(String[] args) {
        
        int arr[]={10,3,5,2};
        int key = 2;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println(i);
                return;
            }
        }
        System.out.println("not found");
    }
}