package collegtor;

import java.util.Scanner;

public class Employee {
   private int id;
   private String name;
   private String address;
   public Employee(){
   }
   public Employee(int id,String name,String address){
       this.id=id;
       this.name=name;
       this.address=address;
   }
   int getID(){
       return id;
   }
   public void Input(){
       Scanner sc=new Scanner(System.in);
       System.out.print("Input id= "); id=sc.nextInt();
       System.out.print("Input name= "); name=sc.next(); sc.nextLine();
       System.out.print("Input address= "); address=sc.nextLine();
   }
   public void Output(){
        System.out.println(+
                id+"\t"+
                name+"\t"+
                address+"\t");
   }
   public void header(){
        System.out.println("ID\tName\tAddress");
}
}

