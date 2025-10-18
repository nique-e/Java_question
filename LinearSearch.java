public class LinearSearch{

    public static void main(String[] args) {
        
        int arr[]={10,2,15,3,6,5};
        int key = 15;
        boolean found = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("is element index " +i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("element not found");
        }
        
    }
}