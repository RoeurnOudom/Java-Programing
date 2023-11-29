package Demo;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code;
        String name,gender;
        float score;
        System.out.print("Input Code= "); code=scan.nextInt(); scan.nextLine();
        System.out.print("Input Name= "); name=scan.nextLine();
        System.out.print("Input Gender= "); gender=scan.nextLine();
        System.out.print("Input Score= "); score=scan.nextFloat();
        System.out.print("Code= "+code+"\n");
        System.out.print("Name= "+name+"\n");
        System.out.print("Gender= "+gender+"\n");
        System.out.print("Score= "+score+"\n");
    }
}
