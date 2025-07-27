import java.util.*;

public class factRecursion {

    public static int fact(int a){
        if(a ==1){
            System.out.print(1);
            return 1;
        }
        System.out.print(a + "*");
        return a* fact(a-1);
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int ans = fact(a);
        System.out.print("=" + ans);
    }
}