import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int p = 1;
        for (int i = m; i < n; i++) {
            p *= i;
        }
        System.out.println(p);
    }
}
