import java.util.Scanner;

class Arthematic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number:");
        int a;
        a=sc.nextInt();
        System.out.println("enter  a second number:");
        int b=sc.nextInt();
        sc.close();


        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
    }

    
}
