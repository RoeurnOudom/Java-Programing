package collegtor;
import java.util.Hashtable;
import java.util.Map;
public class Hashtable4 {
    public static void main(String[] args) {
        //Creating map of book
        Map<Integer,Book> map=new Hashtable<Integer,Book>();
        //Creating Book
        Book b1=new Book(101,"C/C++","Kro IT","ETEC",8);
        Book b2=new Book(102, "HTMLC,SS", "Kro IT","ETEC",4);
        Book b3=new Book(103, "Java", "Kro it","ETECT", 6);
        //adding book to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key+" Details: ");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.qty);
        }
    }
}
