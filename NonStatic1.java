class NonStatic{
    int id =(int)51.6;
    String s ="jspider";
    char c='m';
    int mobile =(int)996602420;
    String address="banguluru";


}
class NonStatic1{
    public static void main(String[] args){
  NonStatic t =new NonStatic();
  System.out.println(t.id);
  System.out.println(t.mobile);
  System.out.println(t.address);
  System.out.println(t.s);
  System.out.println(t.c);
    }
}