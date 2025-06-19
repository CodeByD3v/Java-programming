// marks
import java.util.*;

class marks{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark - ");
        int mark = sc.nextInt();
        
        if (mark > 90){
            System.out.print('A');
        }
        else if (70 <  mark && mark <= 89 ){
            System.out.print('B');
        }
        else if ( 50 < mark && mark <=69){
            System.out.print('C');
        }
        else{
            System.out.print('D');
        }

        sc.close();
    }
}
