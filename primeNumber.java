import java.util.Scanner;

public class primeNumber {

    public static boolean checkPrime(int a){
    for(int i=2;i<a/2;i++){
        if(a %i == 0) return false;
    }
    return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime: ");
        int a = sc.nextInt();
        if (checkPrime(a))
            System.out.println(a + " is prime number");
        else System.out.println(a + " is not prime number");
        sc.close();
    }
}
