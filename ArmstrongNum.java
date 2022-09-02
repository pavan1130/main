import java.util.Scanner;

class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int r;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n /= 10;
        }
        if (sum == temp) {
            System.out.println(temp + " --- is a armstrong num");
        } else {
            System.out.println(temp + " --- is not a armstrongnum");
        }
    }
}