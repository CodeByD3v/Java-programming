public class BubbleSort {
    public static void main(String[] args){

        int[] arr = {1 ,11 , 3, 10 , 4 , 66 ,5,6 } ;
        int n = arr.length ; 
        for(int i = 0 ; i < n - 1 ; i ++){
            for (int j = 0 ; j < n - i - 1 ; j++){
                if(arr[j]  > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t ; 
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }   
}
