package Demo;

import java.util.Scanner;

public class hw3_page10 {
    public static void main(String[] args) {
        float s1,s2,s3,s4,s5,total,avg;
        Scanner scan=new Scanner(System.in);
        System.out.print("Input Score1= "); s1=scan.nextFloat();
        System.out.print("Input Score2= "); s2=scan.nextFloat();
        System.out.print("Input Score3= "); s3=scan.nextFloat();
        System.out.print("Input Score4= "); s4=scan.nextFloat();
        System.out.print("Input Score5= "); s5=scan.nextFloat();
        total= s1+s2+s3+s4+s5;
        avg=total/5;
        System.out.print("Score1= "+s1+"\n");
        System.out.print("Score2= "+s2+"\n");
        System.out.print("Score3= "+s3+"\n");
        System.out.print("Score4= "+s4+"\n");
        System.out.print("Score5= "+s5+"\n");
        System.out.print("Total= "+total+"\n");
        System.out.print("Average= "+avg+"\n");
    }
}
