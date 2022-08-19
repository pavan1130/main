import java.util.Scanner;
class Bitwise {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        int a=n&m;
        System.out.println("AND ="+a);
        int o=n|m;
        System.out.println("OR="+o);
        int x=n^m;
        System.out.println("xOR="+x);
        int l=n<<m;
        System.out.println("left shift="+l);
        int r=n>>m;
        System.out.println("right shift="+r);
    }
    
}
