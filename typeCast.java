/**
 * typeCast
 */
class typeCast {
    public static void main(String[] arg){
        int i = 5;
        double d = i;
        System.out.println(i);
        System.out.println(d);

        double d2 = 12;
        int i2 = (int) d2;
        System.out.println(d2);
        System.out.println(i2);

        int i3 = 44;
        float f1 = i3;
        System.out.println(f1);
        
        char c = '8';
        int i4 = c - '0';
        System.out.println(i4);

        int i5 = 9;
        char c2 = (char) (i5 +'0') ;
        System.out.println(c2);

    }
    
}