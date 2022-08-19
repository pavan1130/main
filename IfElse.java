 import java.util.Scanner;
 class IfElse { 
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        sc.close();
        if(a%2==0){
            System.out.println("even  number");
        
        }
        else{
            System.out.println("odd  number");

        }
    }
    
}
