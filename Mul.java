import java.util.Scanner;

class Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int p = 0;
        for (int i = 1; i <= 10; i++) {
            p = p + a;
            System.out.println(a + "*" + i + "=" + p);
        }
    }
}