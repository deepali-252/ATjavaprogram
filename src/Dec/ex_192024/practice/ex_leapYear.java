package Dec.ex_192024.practice;

import java.util.Scanner;

public class ex_leapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("check the leap year");
        int year = sc.nextInt();

        String result = (year%4==0)? "This is the leap year" : "This is not the leap year";
        System.out.println(result);


    }
}
