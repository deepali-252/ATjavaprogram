package Dec.ex_192024.ex_14_String;

public class ex_14_Intervieww {
    public static void main(String[] args) {

        String check1 = "Hello";
        String check3 = "Hello";


        String check2 = new String("Hello");
        String check4 = new String("Hello");


        System.out.println(check1.equals(check2));
        System.out.println(check2.equals(check3));

    }
}
