package OOP.Polymophsim;

abstract class Bank {

abstract int getRateOfInterest();

}

class SBI extends Bank {

    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {

    int getRateOfInterest() {
        return 8;
    }
}

public class Abstact {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}
