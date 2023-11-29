package Array;
import java.util.Scanner;
public class example_page4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String id[] =new String[10];
        String name[]=new String[10];
         Double score[]=new Double[10];
        int n,i;
        do{
            System.out.print("Input n      =  "); n=scan.nextInt();
            for (i = 0; i < n; i++){
                System.out.print("Input ID     = "); id[i]=scan.next(); scan.nextLine();
                System.out.print("Input Name   = "); name[i]=scan.nextLine();
                System.out.print("Input Score  = "); score[i]=scan.nextDouble();
            }
            for ( i = 0; i < n; i++) {
                System.out.println("ID     = "+id[i]);
                System.out.println("Name   = "+name[i]);
                System.out.println("Score  = "+score[i]);
            }
        }while(i<n);
    }
}
