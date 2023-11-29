package Array;
import java.util.Scanner;
import javax.swing.JOptionPane;
public final class example7_page6 {
        int x[]= new int [100];
        int i,n,j,op;
        Scanner scan =new Scanner(System.in);
        void input(int i,int n){
        for ( i = 0; i < n; i++) {
            System.out.print("Input value x ["+i+"]= "); x[i]=scan.nextInt();
        }
    }
        final void output(int i,int n){
            System.out.print("Value x["+n+"]= ");
        for ( i = 0; i < n; i++) {
            System.out.print(x[i]+" ");
        }
            System.out.println("");
    }
        void search(int element,int i,int n){
            for (i = 0; i < n; i++) {
                if(element == x[i]){
                    System.out.println("Value x["+i+"]= "+x[i]);
                }
            }
        }
        void update(int element,int i,int n){
            for (i = 0; i < n; i++) {
                if(element == x[i]){
                    System.out.println("Enter new element of x["+i+"]= "); x[i]=scan.nextInt();
                }
            }
        }
        void delete(int element,int i){
            for (i = 0; i < n; i++) {
                if(element == x[i]){
                    for(j=i;j<n;j++){
                        x[j] = x[j+1];
                    }
                    n--;
                }
            }
        }
        void sort(){
            int temp;
            for (i = 0;  i< n; i++) {
                for ( j = i+1 ; j < n; j++) {
                   if(x[i]>x[j]){
                        temp=x[i];
                        x[i]=x[j];
                        x[j]=temp;          
                   }
                }
            }
        }
        public example7_page6(){
            do{
                   System.out.print("1. Input\n");
                   System.out.print("2. Output\n");
                   System.out.print("3. Search\n");
                   System.out.print("4. Update\n");
                   System.out.print("5. Delete\n");
                   System.out.print("6. Sort\n");
                   System.out.print("Please choose one= ");
                   op=scan.nextInt();
            switch(op){
            case 1 -> {
                System.out.print("\nInput number= "); n=scan.nextInt();
                input(i,n);
            }
            case 2 -> {
                output(i, n);
            }
            case 3 -> {
                   int search;
                   System.out.println("Enter element to search= "); search=scan.nextInt();
                   search(search, i, n);
            }
            case 4 -> {
                   int update;
                   System.out.println("Enter element to update= "); update=scan.nextInt();
                   update(update, i, n);
            }
            case 5 -> {
                   int delete;
                   System.out.println("Enter element to delete= "); delete=scan.nextInt();
                   delete(delete, i);
            }
            case 6 -> {
                  sort();
            }
            default->{
            JOptionPane.showConfirmDialog(null, "sothing wrong");
                       
            }
         }
            }while(op!=7);
        }
        public static void main(String[] args) {
        new example7_page6();
    }
}
