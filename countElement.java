import java.util.*;

public class countElement {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        String st = "";
        while(a!=0){
            long c = a%10;
            st+=c;
            a=a/10;
        }
        int max =0;
        int idx = 0;
        
        for (int i = 0; i < st.length(); i++) {
            int count=0;
            for (int j = i+1; j < st.length(); j++) {
                if(count>max){
                    max = count;
                    idx = i;
                }
                if(st.charAt(i) == st.charAt(j) ) count++;
            }
        }
        System.out.println("max element is: " +st.charAt(idx));
        input.close();
    }
}
