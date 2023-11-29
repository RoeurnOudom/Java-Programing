package Demo;
public class Function_ex2 {
    public static void main(String[] args) {
        int a =30;
        int b =45;
        System.out.println("Before swapping, a= "+a+"and b= "+b);
         //invoke the swap mathod
    swapFunction(a,b);
        System.out.println("Now Before and after using value wille be same here");
        System.out.println("After swapping,a= "+a+"and b= "+b);
    }
  public static void swapFunction(int a, int b){
      System.out.println("Before swapping(Inside),a= "+a+"b= "+b);
      //swapping n1 with n2
      int c=a;
      a=b;
      b=c;
      System.out.println("After swapping(Inside),a= "+a+"b= "+b);
  }  
}
