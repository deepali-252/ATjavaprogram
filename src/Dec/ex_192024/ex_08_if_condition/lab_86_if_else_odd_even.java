package Dec.ex_192024.ex_08_if_condition;

import java.util.Scanner;

public class lab_86_if_else_odd_even {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("check the even and odd");
     int  num = sc.nextInt();

     if(num %2 == 0){
         System.out.println("the number is even ");
     }else {
         System.out.println("The number is odd");
     }


    }
}
