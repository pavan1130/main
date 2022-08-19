import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = m; i <= n; i++) {

            sum += i;

        }
        System.out.println(sum);
    }
}