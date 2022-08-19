import java.util.Scanner;

class Ternary3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        String result=a<b&&a<c?a+"is smallest":b<c?b+"is smallest":c+"is smallest";
        System.out.println(result);
    }
}
