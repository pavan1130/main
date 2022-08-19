import java.util.Scanner;

class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        sc.close();
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(t + " digits" + count);
    }
}
