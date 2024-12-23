package Dec.ex_192024;

public class test015 {
    public static void main(String[] args) {

        int a= 10;
        int b = 30;
        int c = 90;
       int Result = (a >=  b && a >= c ) ? a : (b >=  c  ? b : c );
       System.out.println("max number is " + Result);
    }
}
