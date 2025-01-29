package Dec.ex_192024.practice;

import java.util.Scanner;

public class maximumoftwono {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int max = Math.max(num1 , num2);

        System.out.println("The Max number is : " +max);

        sc.close();
        }

    }

