package Demo;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment=98;
        String payby;
        double case_recive=0,case_return=0;
        System.out.println("Total Payment = $"+payment);
        System.out.println("Total Payment = ៛"+(payment*4100));
        System.out.println("Choose one= "); payby=scan.nextLine();
        if (payby.equalsIgnoreCase("dollar")||payby.equalsIgnoreCase("$")){
            while (true) {                
                System.out.println("Enter cash Recive= "); case_recive=scan.nextDouble();
                if (case_recive<payment) {
                    System.out.println("Your balance is low.....!");
                }else {
                    case_recive=case_return-payment;
                }
            }
          }
    }
}
