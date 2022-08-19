 import java.util.Scanner;
 class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a first number:");

        int n = sc.nextInt();
        System.out.print("enter a second number:");
        int m =sc.nextInt();
int count=0;
        sc.close();
        for(int i=n;i<=m;i++){
            if(i%3==0){
                count++;
            }}
            System.out.println(count+"it is count a divisible 3");
    
    }
}
