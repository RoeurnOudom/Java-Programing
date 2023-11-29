package Demo;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //-------------Loop---------
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        //------------While---------
        int i=0;
        while (i<10) {            
            System.out.print(i+" ");
            i++;
        }
        System.out.println(" ");
        i=10;
        //-----------------Do while loop-------------
        do{
            System.out.print("Input i= "); i = scan.nextInt();
        }while (i!=10);
        int a[]={1,2,3,4,5,6,7,8,9,10};
            for (int j : a){
                System.out.print(j+"");
            }
    }       
}
