package Dec.ex_192024.ex_08_if_condition;

import java.util.Scanner;

public class Lab_87_if_else_ElseIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();

        if(num1 > num2 ){
            System.out.println("num1 is greater");
        }else if(num2 > num1 ) {
            System.out.println("num2 is greater ");
        }else {
            System.out.println("both are equal");
        }
    }
}
