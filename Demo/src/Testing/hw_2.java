package Demo;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long code;
        String name;
        int qty;
        float price,total,dis,pay;
        System.out.print("Input Code= "); code=scan.nextLong(); scan.nextLine();
        System.out.print("Input Name= "); name=scan.nextLine(); 
        System.out.print("Input Qty= "); qty=scan.nextInt();
        System.out.print("Input Price= "); price=scan.nextFloat();
        total=price*qty;
        if(total>0 && total<=20){
            dis=0;
        }else if(total>20 && total<=90){
            dis=20;
        }else{
            dis=50;
        }
        pay=total-(total*dis/100);
        System.out.print("Code= "+code+"\n"); 
        System.out.print("Name= "+name+"\n"); 
        System.out.print("Qty= "+qty+"\n"); 
        System.out.print("Price= "+price+"\n"); 
        System.out.print("Total= "+total+"\n");
        System.out.print("Payment= "+pay+"\n"); 
    }
}
