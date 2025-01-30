package Dec.ex_192024.practice;

import java.util.Scanner;

public class ex_Find_largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the largest 3 no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (a>b)?((a>c)? a:c):(b>c)?b:c;
        System.out.println(result +"this no is the largest");


    }
}
