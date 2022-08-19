import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number:");
       int a=sc.nextInt();
       System.out.print("enter 2nd number:");
       int b=sc.nextInt();
       sc.close();
       System.out.println("before swap"+ a+"and "+b);
       a=a+10;
       a=a+10;
       b=b-20;
       System.out.println("after swap"+a+"and"+b);
        }
}
