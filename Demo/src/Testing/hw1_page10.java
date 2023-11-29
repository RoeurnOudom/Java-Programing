package Demo;

import java.util.Scanner;

public class hw1_page10 {
    public static void main(String[] args) {
        int id;
        String name,gender,add;
        Scanner scan=new Scanner(System.in);
        System.out.print("Input ID= "); id=scan.nextInt(); scan.nextLine();
        System.out.print("Input Name= "); name=scan.nextLine(); 
        System.out.print("Input Gender= "); gender=scan.nextLine();
        System.out.print("Input Address= "); add=scan.nextLine();
        
        System.out.print("ID= "+id+"\n");
        System.out.print("Name= "+name+"\n");
        System.out.print("Gender= "+gender+"\n");
        System.out.print("Address= "+add+"\n");
    }
    }
    }
}
