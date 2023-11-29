package OOP.Inheriten;

import java.util.Scanner;

public class Info {
    Scanner scan = new Scanner(System.in);
    protected int id;
    protected String name;
    protected String gender;
    //constructor
    public Info(){
        id = 0;
        name = "Known";
        gender = "Known";
    }
    public Info(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Scanner getScan() {
        return scan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
    public void input(){
        System.out.print("Input ID      = "); id=scan.nextInt();
        System.out.print("Input Name    = "); name=scan.next();
        System.out.print("Input Gender  = "); gender=scan.next();
    }
    public void output(){
        System.out.print("\t"+id+"\t"+name+"\t"+gender);
    }
}
