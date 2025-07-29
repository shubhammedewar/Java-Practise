import java.util.*;

public class temperature {
    public static void  main(String [] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in C: ");
        float temp = input.nextFloat();
        float kelvin  = (temp *9/5) + 32;
        System.out.println("Temperature in kelvin is: " + kelvin);

        input.close();

    }
}
