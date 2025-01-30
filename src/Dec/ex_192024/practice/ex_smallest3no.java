package Dec.ex_192024.practice;

import java.util.Scanner;

public class ex_smallest3no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the smallest no of 3");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (a<b)?((a<c)?a:c):(b<c)?b:c;
        System.out.println(result);


    }
}
