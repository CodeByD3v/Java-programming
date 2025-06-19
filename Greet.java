// importing libaries
import java.util.*;

public class lec_01{

    public static void main(String[] args){

        // scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a programming language name : - ");
        String userInput = sc.next();
        
        sc.close();

        System.out.print("Hello "+ userInput);
    }
}
