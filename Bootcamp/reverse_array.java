public class reverse_array{ 
    
    public static void main(String[] args){
        
        int[] array = {1 , 2 , 3 , 4 , 5 , 6};
        int[] dup = new int[array.length] ; 

        int index = 0 ; 
        
        for(int i = array.length-1 ; i>=0 ; i--){
            dup[index] = array[i];
            index += 1;
        
        }
        
        for (int i = 0 ; i  < dup.length ; i++ ){
            System.out.print(dup[i]+" ") ; 
        }
    }
}