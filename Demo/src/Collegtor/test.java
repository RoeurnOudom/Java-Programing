package collegtor;
import java.util.*;
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        for (int i = 0; i < list.size(); i++) {
            String get = list.get(i);
            System.out.println("Name= "+get);
        }
    }
}