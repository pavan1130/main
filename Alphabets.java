import java.util.Scanner;

class Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a elements");

        int a = sc.nextInt();
        sc.close();
        char c = 'a';
        for (int i = 1; i <= 26; i++) {
            if (i == a) {
                System.out.println(a + "-" + c);
                break;

            }
            c++;
        }
    }
}
