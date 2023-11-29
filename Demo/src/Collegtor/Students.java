package collegtor;

import java.util.Scanner;

class Students {
    private int rollno;
    private String name;
    private int age;
    Scanner scan = new Scanner(System.in);
    public Students(){
        rollno=0;
        name="";
        age=0;
    }
    public Students(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public void Input(){
    System.out.print("Input roll= "); rollno=scan.nextInt();
    System.out.print("Input Name= "); name=scan.next();
    System.out.print("Input age= "); age=scan.nextInt();
}
    public void Output(){
        System.out.println(+
                rollno+"\t"+
                name+"\t"+
                age+"\t");
    }
    static public void header(){
        System.out.println("roll\tName\tAvg");
}
}