import java.util.Scanner;

class Odd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = n; i <= b; i++) {

            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("odd number sum" + sum);
    }

}
