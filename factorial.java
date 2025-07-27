import java.util.*;

public class factorial {

    public static void fact(int a){
        int prod =1;
        System.out.print(a);
        while (a!=0) {
            prod*= a;
            a--;
            if(a!=0) System.out.print("*"+ a);
        }
        System.out.print("=" + prod);
    }
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fact(a);
        sc.close();
    }
}
