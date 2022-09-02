import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = n + 1;
        double d;
        d = Math.sqrt(i);
        if ((int) d == d) {
            System.out.print(d + "this is sunny number");
        } else {
            System.out.print("this is not  sunny number");
        }
    }
}