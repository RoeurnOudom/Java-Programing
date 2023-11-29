package collegtor;
import java.util.Hashtable;
import java.util.Map;
public class Hashtable_3 {
    public static void main(String[] args) {
        // Creating  a hash table
        Hashtable<String,String> h = new Hashtable<String,String>();
        Hashtable<String,String> h1 = new Hashtable<String,String>();
        h.put("ETEC1001", "Sok Dara");
        h.put("ETEC1002", "Va Sythong");
        h.put("ETEC1003", "Song Tona");
        //Create a clone or shallow copy of hash table
        System.out.println("--------------------After Clone---------------------");
        h1=(Hashtable<String, String>)h.clone();
        h.clear();
        for(Map.Entry m:h.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
        for(Map.Entry m:h1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
