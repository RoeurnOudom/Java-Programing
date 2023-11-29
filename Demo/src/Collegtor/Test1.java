package collegtor;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ArrayList<Employee>list =new ArrayList();
        Employee emp=new Employee();
        int i,n=0,op=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1) Add");
            System.out.println("2) View");
            System.out.println("3) Search");
            System.out.println("4) Update");
            System.out.println("5) Remove");
            System.out.println("6) insert");
            System.out.println("7) add more");
            System.out.printf("Enter your choice: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Input number of employee= ");
                    n=sc.nextInt();
                    for (i = 0; i < n; i++) {
                        emp=new Employee();
                        emp.Input();
                        list.add(emp);
                    }
                    break;
                case 2:
                    emp.header();
                    for (i = 0; i < list.size(); i++) { 
                        list.get(i).Output();
                    }
                case 3:{
                    int var;
                    System.out.println("Search by id= ");
                    var=sc.nextInt();
                    for(i=0;i<list.size();i++){
                        if(var==list.get(i).getID())
                        list.get(i).Output();
                    }
                    }break;
                case 4:{
                    int var;
                    System.out.println("Search by id for update= "); var=sc.nextInt();
                    for (i = 0; i < list.size(); i++) {
                        if(var==list.get(i).getID()){
                            emp=new Employee();
                            emp.Input();
                            list.set(i, emp);
                        }
                    }
                }break;
                case 5:{
                    int de;
                    System.out.println("Search id for delete= "); 
                    de=sc.nextInt();
                    for (i = 0; i<list.size();i++) {
                        if(de==list.get(i).getID()){
                            list.remove(i);
                        }
                    }
                }break;
                case 6:{
                    int var;
                    System.out.println("Search buy id for insert= "); var=sc.nextInt();
                    for(i=0;i<list.size();i++){
                        if(var==list.get(i).getID()){
                            emp=new Employee();
                            emp.Input();
                            list.add(i,emp);
                            break;
                        }
                    }
                }break;
                case 7:{
                    int add,b=0;
                    System.out.println("Add more= "); add=sc.nextInt();
                    for (i = 0; i< list.size();i++) {
                        emp=new Employee();
                        emp.Input();
                        list.add(i,emp);
                    }if(b==0){
                        System.out.println("Not success");
                    }else{
                        System.out.println("Succsess");
                        n+=add;
                    }
                }break;
            }
    }while(op!=9);
 }
}