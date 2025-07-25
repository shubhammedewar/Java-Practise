import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
