package Dec.ex_192024.practice;

import java.util.Scanner;

public class bouns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("Enter the Experince");
        float experience = sc.nextInt();

        double bonus = 0;

        if(experience>1){

            bonus =0;
        }
        else if(experience>=3){

            bonus =salary*0.05;
        }
        else if(experience >= 4 && experience <= 6) {

            bonus = salary*0.10;

        }else{

            bonus = salary*0.15;
        }
    }
}
