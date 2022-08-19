import java.util.Scanner;
 class Quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number:");
        int a =sc.nextInt();
        
        System.out.println("enter a second number:");
        int b =sc.nextInt();
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }
  System.out.println(count +" times of Quotient");

    }

}
