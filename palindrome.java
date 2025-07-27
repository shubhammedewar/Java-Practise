import java.util.Scanner;

public class palindrome {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();
        int s = 0;
        int e = st.length()-1;
        // System.out.println();
        while(s<=e){
            if(st.charAt(s) != st.charAt(e)){
                System.out.println("Not palindrome");
                return;
            }
            s++;
            e--;
        }
        System.out.println("It is Palindrome");
    }
}
