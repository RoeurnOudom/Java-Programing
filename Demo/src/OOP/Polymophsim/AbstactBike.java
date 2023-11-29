package OOP.Polymophsim;
abstract class Bike{
    Bike(){
        System.out.println("Bike is create");
    }
    abstract void run();
    void changGear(){
        System.out.println("Gear changed");
    }
}
class Honda extends Bike{
    void run (){
        System.out.println("Runing safety.......");
    }
}
public class AbstactBike {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changGear();
    }
}
