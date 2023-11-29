package report6_7;

import java.util.ArrayList;
import java.util.List;

public class ListProduct {
    int id;
    String name;
    int qty;
    double price;
    int discount;
    double payment;

    public ListProduct(int id, String name, int qty, double price, int discount, double payment) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.discount = discount;
        this.payment = payment;
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

    public int getDiscount() {
        return discount;
    }

    public double getPayment() {
        return payment;
    }
    
    static List<ListProduct> list = new ArrayList<>();
}
