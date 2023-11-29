package OOP.Inheriten;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp = new Employee();
        int i, n, op;
        do {
            System.out.println("===========Menu==========");
            System.out.println("1) Input");
            System.out.println("2) Output");  
            System.out.println("3) Search");
            System.out.println("4) Update");
            System.out.println("5) Delete");
            System.out.println("6) Insert");
            System.out.println("7) Sort");
            System.out.println("8) Exit");
            System.out.print("Enter your choice: ");
            op = scan.nextInt();
            switch(op) {
                case 1: {
                    System.out.print("Input numbe of Employee = ");
                    n = scan.nextInt();
                    for(i = 0; i < n; i++) {
                        emp = new Employee();
                        emp.input();
                        list.add(emp);
                    }
                }
                break;
                
                case 2: {
                    emp.header();
                    for(i = 0; i < list.size(); i++) {
                        list.get(i).output();
                    }
                }
                break;  
                case 3: {
                    int search;
                    System.out.print("Input id for search = ");
                    search = scan.nextInt();
                    emp.header();
                    for(i = 0; i < list.size(); i++) {
                        if(search == list.get(i).getId()) {
                            list.get(i).output();
                        }
                    }
                }
                break;
                case 4: {
                    int update;
                    System.out.print("Input id for update = ");
                    update = scan.nextInt();
                    emp.header();
                    for(i = 0; i < list.size(); i++) {
                        if(update == list.get(i).getId()) {
                            list.get(i).input();
                        }
                    }
                }
                break;
                case 5: {
                    System.out.print("Input id for delete = ");
                    int deleteId = scan.nextInt();
                    for(i = 0; i < list.size(); i++) {
                        if(list.get(i).getId() == deleteId) {
                            list.remove(i);
                        }
                    }
                }break;
                case 6:{
                      int insert;
                      System.out.print("Input id for insert= "); insert=scan.nextInt();
                      emp.header();
                      for(i=0;i<list.size();i++){
                          if(list.get(i).getId() == insert){
                          emp = new Employee();
                          emp.input();
                          list.add(i,emp);
                          break;
                        }
                      }
                }break;
                case 7:{
                    Collections.sort(list, Comparator.comparing(Employee::getId));
                }break;
            }
        } while(op!=8);
    }
}