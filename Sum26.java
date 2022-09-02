import java.util.Scanner;

class Sum26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        int sum1 = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;

        }
        while (sum > 0) {
            int rem = sum % 10;
            sum1 = sum1 + rem;
            sum = sum / 10;
        }
        System.out.println(sum1);
    }

}
