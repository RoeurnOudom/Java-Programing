package collegtor;

import java.util.Scanner;

public class ProductModel {
    Scanner scan = new Scanner(System.in);
    private int id;
    private String name;
    private int qty;
    private double price;
    
    public ProductModel(){
        id=0;
        name=null;
        qty=0;
        price=0.0;
    }
    
    public ProductModel(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
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
    
    public double total(){
        return qty*price;
    }
    
    public int discount(){
        int dis;
        return dis= (total() < 1)?0
                    :(total() >= 1 && total() < 20)?5
                    :(total() >=20 && total() < 40)?10
                    :15;
                     
    }
    
    public double payment(){
        return total()-(total()*discount())/100;
    }
    
    public void input(){
        System.out.print("Input id     = "); id=scan.nextInt();
        System.out.print("Input Name   = "); name=scan.next();
        System.out.print("Input Qty    = "); qty=scan.nextInt();
        System.out.print("Input Price  = "); price=scan.nextDouble();
    }
    
    static void header(){
        System.out.println("\tID\tName\tQty\tPrice\tTotal\tDiscount\tPayment");
    }
    public void output(){
        System.out.println("\t"+id+"\t"+name+"\t"+qty+"\t"+price+"\t"+total()+"\t"+discount()+"\t\t"+payment());
    }
}
