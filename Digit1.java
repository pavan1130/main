import java.util.Scanner;

class Digit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        while (a > 0) {
            int b = a % 10;
            System.out.println(b);
            a /= 10;
        }
        System.out.println(a);
    }

}
