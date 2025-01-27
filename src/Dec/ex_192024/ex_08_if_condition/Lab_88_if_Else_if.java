package Dec.ex_192024.ex_08_if_condition;

import java.util.Scanner;

public class Lab_88_if_Else_if {
    public static void main(String[] args) {

        Scanner sc  = new Scanner (System.in);
        System.out.println("enter first side ");
                Double side1 = sc.nextDouble();
        System.out.println("enter secound side ");
        Double side2 = sc.nextDouble();
        System.out.println("enter third side ");
        Double side3 = sc.nextDouble();

        if(side1 > 0 || side2 >0 || side3 >0) {
            System.out.println("All sides are positive");
        } else {

             if(side1 == side2 && side2 == side3 && side3 == side1){
                 System.out.println(" equal");
             }else if( side1 == side2 || side2 == side3 || side3 == side1) {
                 System.out.println("iso");
             }
             else {
                 System.out.println("scal");
             }

            }

        }
    }


