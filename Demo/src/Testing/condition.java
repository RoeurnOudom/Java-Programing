package Demo;
import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b;
        System.out.print("Input a= "); a=scan.nextInt();
        System.out.print("Input b= "); b=scan.nextInt();
        // if statement
        if(a == b){
            System.out.println("a is equal then b");
        }
        // if else statement
        if(a > b){
            System.out.println("a is bigger then b");
        }else{
            System.out.println("b is bigger then a");
        }
        //if else if else statement
        if(( a + b) > 0){
            System.out.println("a + b > 0");
        }else if(( a + b) < 0){
            System.out.println("a + b < 0");
        }else{
            System.out.println("a + b = 0");
        }
        // Ternary Operator
        // if else statement
        String answer1;
        System.out.print("Do you love me?: "); answer1=scan.next();
        
        String result1 = (answer1.equalsIgnoreCase("Yes"))? "Congratulation":"Try again...";
        System.out.println("result1= "+result1);
        
        // if else if else statement
        String answer2;
        System.out.print("Watch movie or not: "); answer2=scan.next();
        
        String result2 = (answer2.equalsIgnoreCase("Yes"))? "let's go...":"Oh! come on...";
        System.out.println("result2= "+result2);
    }   
}
