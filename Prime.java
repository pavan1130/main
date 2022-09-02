import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = 0;

        sc.close();
        if (a != 1) {
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                m++;
                break;
            }
        }

        if (m > 0) {
            System.out.println(" not prime");

        } else {
            System.out.println(a + "a prime or composite");
        }
    }
}
