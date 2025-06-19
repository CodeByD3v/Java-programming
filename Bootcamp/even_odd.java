import java.util.* ;


public class even_odd{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);      
        System.out.print("How many number of - ");
        int n = sc.nextInt();
        int[] array = new int[n] ;
    
        for (int i = 0 ; i < n ; i++){
            System.out.print("Enter element - ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0 ; i < array.length ; i++){
           if (array[i] % 2 == 0){
               System.out.println(array[i]+" is even.");
           }
           else{
                System.out.println(array[i]+" is odd.");
           }
        }
        sc.close();
        
    }
}