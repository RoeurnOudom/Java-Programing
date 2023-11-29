package collegtor;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class Student1 {
    public static void main(String[] args) {
          Hashtable<Integer,StudentModel> hw = new Hashtable<>();
          StudentModel stu = new StudentModel();
           Scanner scan = new Scanner(System.in);
           int i,n,op;
           do{
                System.out.println("===========Menu==========");
                System.out.println("1) Add");
                System.out.println("2) View");
                System.out.println("3) Search");
                System.out.println("4) Update");
                System.out.println("5) Remove");
                System.out.println("6) Exit");
               System.out.print("Please select an option= "); op=scan.nextInt();
               switch (op) {
                   case 1:{
                       System.out.print("Input number of students to add= "); n=scan.nextInt();
                       for (i = 0; i < n; i++) {
                           stu = new StudentModel();
                           stu.input();
                           hw.put(i, stu);
                       }
                   } break;
                   case 2:{
                       StudentModel.header();
                        for (Map.Entry<Integer, StudentModel> h : hw.entrySet()) {
                            h.getValue().Output(); 
                        }
                   }break;
                   case 3:{
                        int Svalue;
                        System.out.print("Enter student ID to search: ");
                        Svalue = scan.nextInt();
                        for (Map.Entry<Integer, StudentModel> h : hw.entrySet()) {
                            if(h.getValue().getId() == Svalue) {
                                h.getValue().Output();
                                break;
                            }
                        }
                   }break;
                   case 4:{
                        int Uvalue;
                        System.out.print("Enter student ID to update: ");
                        Uvalue= scan.nextInt();
                        for (Map.Entry<Integer, StudentModel> h : hw.entrySet()) {
                            if(h.getValue().getId() == Uvalue) {
                                h.getValue().input();
                                break;
                            }
                        }
                   }break;
                   case 5:{
                        int Revalue;
                        System.out.print("Enter student ID to remove: ");
                        Revalue = scan.nextInt();
                        for (Map.Entry<Integer, StudentModel> h : hw.entrySet()) {
                            if(h.getValue().getId() == Revalue) {
                                hw.remove(h.getKey());
                                break;
                            }
                        }
                   }break;
               }
           }while(op!=6);
    }
}