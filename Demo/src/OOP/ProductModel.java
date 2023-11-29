package OOP;
import java.util.Scanner;
public class ProductModel {
   private int id;
   private String name;
   private int qty;
   private double price;
   public ProductModel(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
   
   public ProductModel(){
       id = 0;
       name = " ";
       qty = 0;
       price = 0;
   }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Scanner getScan() {
        return scan;
    }
   
    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.print("Input id= "); id=scan.nextInt();
        System.out.print("Input name= "); name=scan.next();
        System.out.print("Input Qty= "); qty=scan.nextInt();
        System.out.print("Input Price= "); price=scan.nextDouble();
    }
    public double total(){
        return qty*price;
    }
    public int discount(){
        return (total()>50 && total()<70)?30
                :(total()>30 && total()<=50)?20
                :(total()>20 && total()<-30)?10
                :5;
    }
    public double tax(){
       return payment()*2/100;
               
    }
    public double payment(){
        return (total()*tax()/100)+total();
    }
    public void header(){
        System.out.println("\tID\tName\tQty\tPrice\tTotal\tDiscount\tTax\tPayment");
    }
    public void output(){
        System.out.println("\t"+id+
                            "\t"+name+
                            "\t"+qty+
                            "\t"+price+
                            "\t"+total()+"$"+
                            "\t"+discount()+"%"+
                            "\t\t"+tax()+"%"+
                            "\t"+payment()+"$");
                                   
    }
    
}
