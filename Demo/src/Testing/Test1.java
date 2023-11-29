package Demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
       Scanner scan= new Scanner( System.in);
         int id=1001;
         String name="Kaka";
         float score=90;
        System.out.print("Input ID= "); id=scan.nextInt(); scan.nextLine();
        System.out.print("Input Name= "); name=scan.nextLine();
        System.out.print("Input Score= "); score=scan.nextFloat();
        
        System.out.println("Id= "+id);
        System.out.println("Name= "+name);
        System.out.println("Score= "+score);
    }
}
