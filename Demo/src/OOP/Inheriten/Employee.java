package OOP.Inheriten;

import java.util.Scanner;

public class Employee extends Info{
    Scanner scan = new Scanner(System.in);
    private double s1,s2,s3;

    Employee() {
        super();
        s1=0;
        s2=0;
        s3=0;
    }

    public Employee(int id,String name, String gender,double s1, double s2, double s3) {
        super(id, name, gender);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public double total(){
        return s1+s2+s3;
    }
    public void input(){
        super.input();
        System.out.print("Input Score1 = "); s1=scan.nextDouble();
        System.out.print("Input Score2 = "); s2=scan.nextDouble();
        System.out.print("Input Score3 = "); s3=scan.nextDouble();
    }
    public void output(){
        super.output();
        System.out.println("\t"+s1+"\t"+s2+"\t"+s3+"\t"+total());
    }
    public void header(){
        System.out.println("\tID\tName\tGender\tScore1\tScore2\tScore3\tTotal");
    }
}
