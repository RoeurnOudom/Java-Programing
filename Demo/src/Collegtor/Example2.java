package collegtor;
import java.util.ArrayList;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        ArrayList<ProductModel> list = new ArrayList<>();
        ProductModel pro = new ProductModel();
        Scanner scan = new Scanner(System.in);
        int op=0,i,n;
        do{
            System.out.println("1.Input");
            System.out.println("2.Output");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("6.Insert");
            System.out.println("7.Sort");
            System.out.println("8.Clear");
            System.out.print("Please select option= ");
            op = scan.nextInt();
            switch(op){
                case 1:{ 
                    System.out.print("Input number= "); n=scan.nextInt();
                    for(i=0;i<n;i++){
                        pro = new ProductModel();
                        pro.input();
                        list.add(i, pro);
                    }
                }break;
                case 2:{
                    ProductModel.header();
                    for(i=0;i<list.size();i++){
                        list.get(i).output();
                    }
                }break;
                case 3:{
                    int svalue;
                    System.out.print("Search by id = "); svalue=scan.nextInt();
                    ProductModel.header();
                    for(i=0;i<list.size();i++){
                        if(svalue == list.get(i).getId()){
                            list.get(i).output();
                        }
                    }
                }break;
                case 4:{
                    int dvalue;
                    System.out.print("Delete by id= ");
                    dvalue= scan.nextInt();
                    for(i=0;i<list.size();i++){
                        if(dvalue == list.get(i).getId()){
                            list.remove(i);
                        }
                    }
                }break;
                case 5:{
                    int uvalue;
                    System.out.print("Update by id= ");
                    uvalue= scan.nextInt();
                    for(i=0;i<list.size();i++){
                        if(uvalue == list.get(i).getId()){
                            pro = new ProductModel();
                            pro.input();
                            list.set(i, pro);
                            break;
                        }
                    }
                }break;
                case 6:{
                    int invalue;
                    System.out.print("Insert by id= ");
                    invalue= scan.nextInt();
                    for(i=0;i<list.size();i++){
                        if(invalue == list.get(i).getId()){
                            pro.input();
                            list.set(i, pro);
                        }
                    }
                }break;
                case 8:{
                    System.exit(0);
                }
            }
        }while(op!=8);
        
    }
}
