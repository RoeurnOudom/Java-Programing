package collegtor;
import java.util.Hashtable;
import java.util.Map;
public class Hashtable_2 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hw=new Hashtable<Integer,String>();
        hw.put(100,"RUPP");
        hw.put(101,"SETEC");
        hw.put(102,"ITC");
        hw.put(103,"Norton");
        hw.put(104,"AEU");
        hw.put(105,"NPIC");
        for(Map.Entry m:hw.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //output
        System.out.println("Before remove: "+hw);
        System.out.println("After remove Value 101");
        //remove value for key 101
        hw.remove(101);
        System.out.println("After remove: "+hw);
    }
}
