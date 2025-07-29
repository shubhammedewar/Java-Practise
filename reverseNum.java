import java.util.*;

public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num:");
        int a  = input.nextInt();
        int rev=0 ;
        while(a!=0){
            int b = a%10;
            rev = rev*10 + b;
            a = a/10;
        }
        System.out.println("Reverse number: "+ rev);

        input.close();

    }
}
