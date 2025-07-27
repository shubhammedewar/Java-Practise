import java.util.*;

public class fibonacciRecursion {
    static int a=0, b=1;  
    public static void fibo(int n){

        int sum = a+b;
        if(n <= 0) return ;
        System.out.print(" "+ sum);
        a = b;
        b= sum;
        fibo(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a + " " + b);
        fibo(n-2);
        sc.close();
    }
}
