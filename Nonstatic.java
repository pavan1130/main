class Nonstatic{
    int a=10;

    public static void main(String[] args) 
    {
     Nonstatic d=new Nonstatic();
     System.out.println(d.a);
     System.out.println(d);
    }
}