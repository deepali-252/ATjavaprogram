package Dec.ex_192024;

public class test016 {

    public static void main(String[] args) {

        int x = 200;
        int y = 300;
        int z = 500;

        int result = (x < y && x < z) ?  x   : ( y< z  ? y : z);
        System.out.println("mini no is "+ result);
    }
}
