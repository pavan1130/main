
import java.util.Scanner;
class Ternary1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        String result=a>b&&a>c?a+"a is longest":b>c? b+"b is longest":c+"- c is longest";
        System.out.println(result);
    }

    
    
}
