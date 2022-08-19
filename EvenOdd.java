import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("enter a starting number:");
 int n = sc.nextInt();
 System.out.print("enter a ending number");
 int m=sc.nextInt();
 sc.close();
 int count1=0;
int count2=0;
for(int i=n;i<=m;i++){
if(i%2==0){
    count1++;

}
else{
    count2++;
}}
System.out.println(count1+"     -     "+count2);

    }
    
}
