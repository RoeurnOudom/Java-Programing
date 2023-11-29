package Demo;

import java.util.Scanner;

public class Ex2_page9 {
    public static void main(String[] args) {
        int id;
        String name,gender;
        Scanner objin=new Scanner(System.in);
        System.out.print("Input ID= "); id=objin.nextInt(); objin.nextLine();
        System.out.print("Input Name= "); name=objin.nextLine();
        System.out.print("Input Gender= "); gender=objin.nextLine();
        System.out.print("ID= "+id+"\n");
        System.out.print("Name= "+name+"\n");
        System.out.print("Gender= "+gender+"\n");
    }
}
