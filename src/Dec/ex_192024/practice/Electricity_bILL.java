package Dec.ex_192024.practice;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Electricity_bILL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the bill");
        int bill = sc.nextInt();
        double totalbill = 0;


        if(bill > 101){

            totalbill = bill*0.50;
        }
        else if(bill >201){

            totalbill = bill*0.75;
        }
        else if(bill > 301){

            totalbill = bill*1.20;

        }
        else {
          totalbill = bill*1.50;
        }
    }
}
