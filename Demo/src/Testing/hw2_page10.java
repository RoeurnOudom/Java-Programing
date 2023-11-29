package Demo;

import java.util.Scanner;

public class hw2_page10 {
    public static void main(String[] args) {
        int code,qty;
        String name;
        float price,total;
        Scanner scan=new Scanner(System.in);
        System.out.print("Input Code= "); code=scan.nextInt(); scan.nextLine();
        System.out.print("Input Name= "); name=scan.nextLine();
        System.out.print("Input Qty= "); qty=scan.nextInt();
        System.out.print("Input Price= "); price=scan.nextFloat();
        total= qty*price;
        System.out.print("Code= "+code+("\n"));
        System.out.print("Name= "+name+("\n"));
        System.out.print("Qty= "+qty+("\n"));
        System.out.print("Price= "+price+("\n"));
        System.out.print("Total= "+total+("\n"));
    }
}
