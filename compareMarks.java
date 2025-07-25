import java.util.Scanner;

public class compareMarks {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if(marks > 60 && marks <=70)
            System.out.println("Passed");
        else if(marks > 70 && marks <=80)
            System.out.println("Passed with grade 'C' ");
        
        else if(marks > 80 && marks <=90)
            System.out.println("Passed with grade 'B' ");
        else if (marks >90 )
            System.out.println("passed with grade 'A' ");
        
        else
            System.out.println("failed!!!");
    }
    sc.close();
}
