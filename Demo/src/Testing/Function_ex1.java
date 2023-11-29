package Demo;
public class Function_ex1 {
       //  Non Return funciton with no paramenter
       static void sum1(){
        int x,y;
        x=100;
        y=200; 
        System.out.println("Result of x+y = "+(x+y));
    }
       //non return function with paramenter
       static void sum2(int x, int y){
           System.out.println("Result of x+y = "+(x+y));
       }
       public static void main(String[] args) {
        //calling funciton
        sum1();
        sum2(100,400);
    }
}
