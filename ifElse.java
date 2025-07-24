import java.util.Scanner;

public class ifElse{
    public static void main(String[]arg){
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sca.nextInt();
        if(a>0){
            System.out.println(a + " is positive number");
        }
        else 
            System.out.println(a +" is negative number");
        sca.close();
    }
}