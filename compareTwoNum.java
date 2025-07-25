import java.util.Scanner;

public class compareTwoNum{
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.print("enter value: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " is greater than "+b);
        }
        else System.out.print(b +" is greater than " +a);

        sc.close();
        
    }
}
