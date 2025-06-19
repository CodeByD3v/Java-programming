import java.util.*; 

class Main{
    
    public static void main(String[] args){
        // first number
        System.out.print("Enter a number - "); 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        // operator input
        System.out.print("Enter the operator - ");
        String opr = sc.next();
                
        // second number
        System.out.print("Enter a number - ");
        int b = sc.nextInt();
        
        // calculator
       if (opr.equals("+")){
           
           System.out.println("Adding numbers : " + a + " and " + b +" = "+ (a+b));
       }
       else if (opr.equals("-")){
           System.out.println("Substracting numbers : "+ a +" and "+ b +" = "+ (a-b));
       }
       else if (opr.equals("*")){
           System.out.println("Multiplying numbers : "+ a +" and "+ b +" = "+ (a*b));
       }
       else if (opr.equals("/")){
           System.out.println("Dividing numbers : "+ a + " and " + b +" = "+ (a/b));
       }

       sc.close();
    }
}
