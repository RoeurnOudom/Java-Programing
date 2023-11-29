package Demo;
import java.util.Scanner;
public class information{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int id;
        String name,gender;
        float sc,scpp, sjava,avg,total;
        System.out.print("Input ID        = "); id=scan.nextInt(); scan.nextLine();
        System.out.print("Input Name      = "); name=scan.nextLine();
        System.out.print("Input Gender    = "); gender=scan.nextLine();
        System.out.print("Input Score C   = "); sc=scan.nextFloat();
        System.out.print("Input Score Cpp = "); scpp=scan.nextFloat();
        System.out.print("Input Score Java="); sjava=scan.nextFloat();
        total=sc+scpp+sjava;
        avg=total/3;
        System.out.print("ID= "+id+"\n");
        System.out.print("Name= "+name+"\n");
        System.out.print("Gender= "+gender+"\n");
        System.out.print("Score C= "+sc+"\n");
        System.out.print("Score Cpp= "+scpp+"\n");
        System.out.print("Score Java= "+sjava+"\n");
        System.out.print("Total= "+total+"\n");
        System.out.print("Average= "+avg+"\n");
        if(avg>=100){
            System.out.println("You are Grade A");
        }else if(avg>=90){
            System.out.println("You are Grade B");
        }else if(avg>=80){
            System.out.println("You are Grade C");
        }else if(avg>=70){
            System.out.println("You are Grade D");
        }else if(avg>=60){
            System.out.println("You are Grade E");
        }else{
            System.out.println("You are Grade F");
        }
    }
}
