 import java.util.Scanner;
 class Odd {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter a starting number:");
int n =sc.nextInt();
int count=0;
sc.close();
for(int i=2;i<=Math.ceil(n/2);i++){
if(n%i==0 ){
count++;
}
}
if(count==0){
    System.out.println("its a prime number");

}
else{
    System.out.println("its not prime number");
}
    }
}
