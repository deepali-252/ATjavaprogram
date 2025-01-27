package Dec.ex_192024.ex_09_Switch;

import java.util.Scanner;

public class Lab_96_Assigment
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("print the name");
        String name = sc.nextLine();

        System.out.println("print the age");
        int age = sc.nextInt();

        System.out.println("Print the salary");
        double salary = sc.nextDouble();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary : " + salary);

        sc.close();

    }
}
