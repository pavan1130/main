import java.util.Scanner;
class IfElse1
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    sc.close(); 
    if(n>18&&n<=30){
        System.out.println(" eligiable for army ");
    }
    else{
        System.out.println("not eligiable for army ");

    }
}   
}