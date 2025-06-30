public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1 ,11 , 3, 10 , 4 , 66 ,5,6 } ;
        int n = arr.length ; 
        for(int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n  ; j++){
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t; 
                }
            }
        }
        for(int i = 0  ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
