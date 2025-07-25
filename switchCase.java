import java.util.Scanner;

class switchCase{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        switch(a){
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            case 3:
                System.out.println("This is case 3");
                break;
            default:
                System.out.println("This is default");
        }
        sc.close();
    }
}