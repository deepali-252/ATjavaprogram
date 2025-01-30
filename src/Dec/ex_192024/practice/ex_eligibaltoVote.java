package Dec.ex_192024.practice;

import java.util.Scanner;

public class ex_eligibaltoVote {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int voter = sc.nextInt();

        if(voter >= 18){

            System.out.println("you are allowed to vote");
        }else {
            System.out.println("you are not allowed to vote");
        }

    }
}
