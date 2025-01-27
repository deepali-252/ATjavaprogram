package Dec.ex_192024.ex_10_ForLoop;

public class Lab_111_odd_even {
    public static void main(String[] args) {

        for(int i = 0 ; i<10 ; i++) {
            if (i % 2 == 0) {
                System.out.println("Number is even :" + i);
            } else {
                System.out.println("Number is odd :" + i);
            }
        }
    }
}
