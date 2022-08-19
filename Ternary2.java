 import java.util.Scanner;
 class Ternary2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        String result=n%2==0?n+"even":n+"odd";
        System.out.println(result);

        

    }
    
}
