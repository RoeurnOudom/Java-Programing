package collegtor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List1 {
    public static void main(String[] args) {
        List<Map<Integer,String>>list = new ArrayList<>();
        Map<Integer,String> map = new HashMap();
        map.put(1,"Car");
        map.put(2,"Cat");
        map.put(3,"Cow");
        list.add(map);
        for(Integer key : map.keySet()){
            String value = map.get(key);
            System.out.println("Key: "+key+"\t+value:  "+value);
        }
    }
}
