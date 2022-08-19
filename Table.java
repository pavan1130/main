import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a first number");
        int n = sc.nextInt();
        System.out.print("enter a second number");
        int m = sc.nextInt();
        sc.close();

        for (int c = n; n <= m; n++) {

            for (int i = 1; i <= 10; i++) {

                System.out.println(n + "*" + i + "=" + n * i);

            }
            System.out.println("...................");
        }
        System.out.println("table form in between a two numbers");
    }
}
