package Dec.ex_192024.ex_10_ForLoop;

public class lab_114_even {
    public static void main(String[] args) {


        for (int i = 0; i <=50 ; i++) {
            if(i%2 ==0 ){
                System.out.println("even -> "+i);
                continue;
            }
            System.out.println(i);
        }


    }

}