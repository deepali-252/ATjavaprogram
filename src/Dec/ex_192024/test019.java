package Dec.ex_192024;

import java.util.Scanner;

public class test019 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int age = sc.nextInt();

        if(age > 80){

            System.out.println("allowed to vote");
        }
        else {
            System.out.println("not allowed to vote");
        }

    }

}
