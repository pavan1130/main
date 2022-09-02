import java.util.Scanner;

class Pa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;

        int r = 0;
        while (n > 0) {
            int s = n % 10;
            r = r * s;
            n /= 10;

        }

        if (temp == r) {
            System.out.println("paladem");

        } else {
            System.out.println(" not paladem");

        }
    }
}