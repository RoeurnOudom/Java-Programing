package OOP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        ProductModel  pro = new ProductModel();
        ArrayList<ProductModel> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int i,n,op;
        do {
            System.out.println("===========Menu==========");
                System.out.println("1) Input");
                System.out.println("2) Output");  
                System.out.println("3) Search");
                System.out.println("4) Update");
                System.out.println("5) Delete");
                System.out.println("6) Insert");
                System.out.println("7) Sort");
                System.out.println("8) Cash Money");
                System.out.println("9) Cancel Product");
                System.out.println("10) Exit");
            System.out.print("Enter your choice: ");
            op = scan.nextInt();
             switch (op) {
                case 1:{
                        System.out.print("Input number= "); n=scan.nextInt();
                         for(i=0;i<n;i++){
                             pro = new ProductModel();
                             pro.input();
                             list.add(i, pro);
                         }
                }break;
                case 2:{
                      pro.header();
                      for (i = 0; i < list.size(); i++) {
                            list.get(i).output();
                        }
                }break;
                case 3:{
                      int search;
                      System.out.print("Enter id for search= "); search=scan.nextInt();
                      pro.header();
                      for(i=0;i<list.size();i++){
                          if(search==list.get(i).getId()){
                              list.get(i).output();
                          }
                      }
                }break;
                case 4:{
                      int update;
                      System.out.print("Enter id for update= "); update=scan.nextInt();
                      pro.header();
                      for(i=0;i<list.size();i++){
                          if(update==list.get(i).getId()){
                              list.get(i).input();
                          }
                      }
                }break;
                case 5:{
                      int delete;
                      System.out.print("Enter id for delete= "); delete=scan.nextInt();
                      pro.header();
                      for(i=0;i<list.size();i++){
                          if(delete==list.get(i).getId()){
                              list.remove(i);
                          }
                      }
                }break;
                case 6:{
                      int insert;
                      System.out.print("Enter id for insert= "); insert=scan.nextInt();
                      pro.header();
                      for(i=0;i<list.size();i++){
                          if(list.get(i).getId() == insert){
                          pro = new ProductModel();
                          pro.input();
                          list.add(i,pro);
                          break;
                        }
                      }
                }break;
                case 7:{
                    Collections.sort(list, Comparator.comparing(ProductModel::getId));
                }break;
            }
    }while(op!=10);
  }
}
