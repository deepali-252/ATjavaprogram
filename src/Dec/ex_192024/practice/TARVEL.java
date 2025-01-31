package Dec.ex_192024.practice;

import java.util.Scanner;

public class TARVEL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the visa");
        boolean visa = sc.nextBoolean();

        if(age > 18 && visa){

            System.out.println("Person is allowed to travel");
        }else {
            System.out.println("Person is not allowed to travel");
        }
    }
}
