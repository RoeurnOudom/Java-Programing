package collegtor;
import java.util.Date;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
@AllArgsConstructor
@Getter
@Setter
public class StudentModel {
public StudentModel() {}
  private int id;
  private String name;
  private String gender;
  private double score1;
  private double score2;
  private double score3;
  Date date = new Date();
  SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
  DecimalFormat dcf = new DecimalFormat("#,###,###0.00");
  public double Total() {
    return score1 + score2 + score3;
  }

  public double Average() {
    return Total() / 3;
  }

  public String Grade() {
    return (Average()<50)?"F"
              :(Average()>= 50 && Average()<60)?"E"
              :(Average()>= 60 && Average()<70)?"D"
              :(Average()>= 70 && Average()<80)?"C"
              :(Average()>= 80 && Average()<90)?"B"
              :"A";
  }
   Scanner scan = new Scanner(System.in);
   public void input(){
        System.out.print("Input id     = "); id=scan.nextInt(); scan.nextLine();
        System.out.print("Input Name   = "); name=scan.nextLine(); 
        System.out.print("Gender:      = "); gender=scan.nextLine();
        System.out.print("Score 1:     = "); score1=scan.nextDouble();
        System.out.print("Score 2:     = "); score2=scan.nextDouble();
        System.out.print("Score 3:     = "); score3=scan.nextDouble();
    }
   
    public static void header( ) {
        System.out.println("\tID\tName\tGender\tScore1\tScore2\tScore3\tTotal\tAverage\tGrade\tDate");
    }
   public void Output() {
    System.out.println("\t"+id
                        +"\t"+name
                        +"\t"+gender
                        +"\t"+score1
                        +"\t"+score2
                        +"\t"+score3
                        +"\t"+Total()
                        +"\t"+dcf.format(Average())
                        +"\t"+Grade()
                        +"\t"+df.format(date)
                        );
  }
}
