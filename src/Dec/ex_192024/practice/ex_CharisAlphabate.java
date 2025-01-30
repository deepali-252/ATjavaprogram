package Dec.ex_192024.practice;

import java.util.Scanner;

public class ex_CharisAlphabate {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Check the char if its alphbate or not");
        char c = sc.next().charAt(0);

        if(c>='a' && c>='z' || c>='A' && c>='Z'){

            System.out.println(" char is alphabate");

        }else {
            System.out.println("char is not alphabate");
        }


    }
}
