package collegtor;
import java.util.Hashtable;
import java.util.Map;
public class Hashtable_1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hw=new Hashtable<Integer,String>();
        hw.put(100,"RUPP");
        hw.put(101,"SETEC");
        hw.put(102,"ITC");
        hw.put(103,"Norton");
        hw.put(104,"AEU");
        hw.put(105,"NPIC");
        for (Map.Entry m:hw.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
