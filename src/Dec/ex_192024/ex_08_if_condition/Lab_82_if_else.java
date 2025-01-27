package Dec.ex_192024.ex_08_if_condition;

import java.util.Scanner;

public class Lab_82_if_else {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the value");
        int age = sc.nextInt();

        if(age> 25){

            System.out.println("you are allowed to travel");
        }
        else {
            System.out.println("you are not allowed travel");
        }

    }
}
