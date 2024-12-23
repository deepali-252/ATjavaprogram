package Dec.ex_192024;

import java.util.Scanner;

public class test020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first the value");
        System.out.println("Enter the secound value");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        if (no1 > no2 ){

            System.out.println("no 1 is larger");
        }
        else if (no2 > no1){
            System.out.println("no 2 is larger");

        }
        else {
            System.out.println("equal");
        }

    }
}
