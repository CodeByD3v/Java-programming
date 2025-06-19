public class MIN_MAX{

    // function for finding min
    public static int findmin(int[] arr){
        
        int max = arr[0] ;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max ; 

    }   

    // function for finding max
    public static int findmax(int[] arr){
        
        int min = arr[0] ;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min ; 
    }

    // main function
    public static void main(String[] args){

        // Initializing
        int[] arr = { -1, 4 , 6 ,10 ,111 , 101 , 75 , 683 , 980} ; 

        int min = findmin(arr);
        int max = findmax(arr);
        
        System.out.println("The max element in the array : "+max);
        System.out.print("The min element in the array : "+min);
    }

}