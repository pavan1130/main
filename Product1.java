import java.util.Scanner;

class Product1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = 1;
        int sum = 0;
        int temp = a;
        while (a > 0) {
            int r = a % 10;
            sum = sum + r;
            p = p * r;

            a /= 10;

        }
        if (sum == p) {
            System.out.println("given number" + temp + "spy number");

        } else {
            System.out.println("given  number" + temp + "not spy number");
        }
    }

}
