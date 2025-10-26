 public class BubbleSortArray{

    public static void main(String[] args) {
        
        int arr[] ={3,4,2,5,};
        int n = arr.length;
        int temp;

        for(int i = 0; i<n-1; i++){
            for(int j = 0; j< n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

          System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    }
 }
 }