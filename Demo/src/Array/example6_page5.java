package Array;
import java.util.Scanner;
public class example6_page5 {
    public static void main(String[] args) {
        int[]a=new int[100];
        String st;
        Scanner objin=new Scanner(System.in);
        int n=0,op,i;
        do{
            System.out.print("\n1. Input");
            System.out.print("\n2. Output");
            System.out.print("\n3. Search");
            System.out.print("\nPlease choose one= ");
            op=objin.nextInt();
            switch (op) {
                case 1:{
                    System.out.print("\nInput number= "); n=objin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("\nInput Array= ");
                        a[i]=objin.nextInt();
                    }    
                }break;
                case 2:{
                    for (i = 0; i < n; i++) {
                        System.out.println(a[i]);
                    }
                }break;
                case 3:{
                    int svalue;
                    int b = 0;
                    System.out.print("\nInput value to search= ");
                    svalue=objin.nextInt();
                    for (i = 0; i < n; i++) {
                        if(a[i]==svalue)
                            System.out.print("\nSearch fount");
                            b=1;
                            break;
                    }
                    if(b==0)
                    System.out.print("\nSearch not fount");
                }break;
            }
            System.out.print("\nPress yes to continue>>>>>");
            st=objin.next();
        }while(st.equals("yes"));
    }
}
