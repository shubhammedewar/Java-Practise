import java.util.*;

class fibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers to add: ");
        int a = sc.nextInt();
        int x =0;
        int y= 1;
        System.out.print(x + " ");
        System.out.print(y+ " ");
        int i=2;
        while(i<a){
            int sum = x+y;
            System.out.print(sum+ " ");
            x = y;
            y=sum;
            i++;
        }
        sc.close();
        
    }   
}