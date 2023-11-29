package collegtor;

import java.util.ArrayList;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        Students stu = new Students();
        Scanner scan = new Scanner(System.in);
        int i,n,op;
        do{
          System.out.println("===========Menu==========");
            System.out.println("1) Add");
            System.out.println("2) View");
            System.out.println("3) Search");
            System.out.println("4) Update");
            System.out.println("5) Remove");
            System.out.println("6) Sort");
            System.out.println("7) Exit");
            System.out.print("Enter your choice: ");
            op=scan.nextInt();
            switch(op){
                 case 1:{
                    System.out.print("Input number: "); n=scan.nextInt();
                    for (i = 0; i < n; i++) {
                        stu=new Students();
                        stu.Input();
                        list.add(stu);
                    }
                 }break;
                 case 2:{
                     for(i=0;i<list.size();i++){
                         list.get(i).Output();
                     }
                 }break;
            }
    }while(op!=7);
    }
}