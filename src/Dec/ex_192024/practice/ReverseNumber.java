package Dec.ex_192024.practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        sc.close();

        int reverse = 0;

               while (no > 0){
                   reverse = reverse * 10 + no % 10;
                   no /= 10 ;


        }
               System.out.println("reversed no is : " + reverse);
    }
}
