import java.util.Scanner;

public class calculator{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter operator: ");
            char op = sc.next().charAt(0);

            if(op == 'x' || op == 'X') break ;
            System.out.print("Enter Numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(op == '+') System.out.println(a+b);

            if(op == '-') System.out.println(a-b);

            if(op == '*') System.out.println(a*b);

            if(op == '/') {
                if(a > b) System.out.println(a/b);
                else System.out.println(b/a);
            }

            if(op == '%') {
                if(a > b) System.out.println(a%b);
                else System.out.println(b%a);
            }
        }
        sc.close();
    }
}