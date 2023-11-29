package OOP;
public class oop {
    private int id;
    private String name;
    private String gender;
    
    public oop(){
    id = 1;
    name = "Dara";
    gender = "Male";
    }
    
    public oop(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public void output(){
        System.out.println("\t"+id+
                            "\t"+name+
                            "\t"+gender);
    }
    public static void main(String[] args) {
        oop obj = new oop();
        obj.output();
    }
}

