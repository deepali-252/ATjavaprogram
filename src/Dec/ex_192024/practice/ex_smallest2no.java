package Dec.ex_192024.practice;

import java.util.Scanner;

public class ex_smallest2no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("print the smallest 2 no");
        int a = sc.nextInt();
        int b = sc.nextInt();

      String result =  (a < b) ? a + " is the smallest" : b + " is the smallest";
        System.out.println(result );

    }
}
