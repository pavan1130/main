import java.util.Scanner;

class Student1 {

    static int mobileNo = 996602;

    public static void main(String[] args) {

        for (int i = 0; i <= 2; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("student name -");
            String name = sc.next();

            System.out.println("student id -");
            int id = sc.nextInt();

            System.out.println("student Gender -");
            char c = sc.next().charAt(0);

            System.out.println("studnet contact -" + mobileNo);

        }
        System.out.println();
    }
}
