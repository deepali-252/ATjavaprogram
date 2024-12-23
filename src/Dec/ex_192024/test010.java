package Dec.ex_192024;

public class test010 {

    public static void main(String[] args) {

        int amount = 120;

        String discount = amount >  150 ? "discount is given" : (amount > 50 ?  "discount is not allowed" : "partial discount is given" );
                System.out.println(discount );
    }
}
