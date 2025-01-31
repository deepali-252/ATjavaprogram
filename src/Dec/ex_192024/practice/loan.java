package Dec.ex_192024.practice;

import java.util.Scanner;

public class loan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("Enter the credit score");
        int cred = sc.nextInt();

        if(age > 17 && age < 79 && salary >= 30000 && cred > 649 && cred < 849){

            System.out.println("Employee is eligibale for loan");
        }else{
            System.out.println("Employee is not eligibale for loan");
        }
    }
}
