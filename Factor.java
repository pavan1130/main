import java.util.Scanner;

class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum;

        for (int i = 1; i <= 50; i++) {
            sum = 0;
            for (n = 1; n < i; n++) {
                if (i % n == 0)
                    sum = sum + n;
            }

            if (sum == n)

                System.out.println(i);

        }

    }
}
