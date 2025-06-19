// finding the maximum element in the array

public class MIN_MAX {
    public static void main(String[] args){

        // Initializing the array and max with first element of array
        int[] arr = {4 , 6 ,10 ,111 , 101 , 75 , 683 , 980} ; 
        int min = arr[0] ; 
        int max = arr[0] ; 

        // Iterating through the list to find the maximum and minimum element 
        for ( int i = 0 ; i < arr.length ; i++ ){
            // max 
            if (arr[i] > max ){
                max = arr[i]; 
            }
            // min
            if (arr[i] < min){
                min = arr[i] ; 
            }
        }

        System.out.println("The min element in the array : "+ min);
        System.out.print("The max element in the array : "+ max);

    }
}
