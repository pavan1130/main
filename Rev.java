import java.util.Scanner;

class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        sc.close();
        while (a > 0) {
            int r = a % 10;
            rev = rev * 10 + r;
            a /= 10;
        }
        System.out.println(rev);
    }

}
