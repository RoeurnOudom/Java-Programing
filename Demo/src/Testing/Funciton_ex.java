package Demo;
public class Funciton_ex {
    //------non_return funciton
    static public void sum(){
        int x=20,y=30;
        System.out.println("x + y = "+(x+y));
    }
    static public void sum(int x,int y){
        System.out.println("x + y = "+(x+y));
    }
    public static void main(String[] args) {
     sum();
     sum(10,20);
     Total();
     Total(100,200);
    }
    //--------Return function
    static public int Total(){ //non parameter
        int x=20,y=20;
        System.out.println("x * y = "+(x*y));
        return x*y;
  }
    static public int Total(int x, int y){//has parameter
        System.out.println("x + y = "+(x+y));
        return x+y;
  }
}