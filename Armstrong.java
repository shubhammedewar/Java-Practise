import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        int n =0;
        int b =a;
        int c =a;
        while(b>0){
           b = b/10;
           n++;
        }
        
        int ans =0;
        for (int i = 0; i <n; i++) {
            int r = a%10;

            int p=1;
            if(r != 0){
                for (int j = 0; j <n; j++) {
                    p = p*r;
                }
            }
            ans += p;
            a = a/10;
        }

        if(ans == c){
            System.out.println("It is armstrong," + ans);
        }
        else{
            System.out.println("Not armstrong");
        }
        

        sc.close();
    }
}
