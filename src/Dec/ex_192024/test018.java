package Dec.ex_192024;

import java.util.Scanner;

public class test018 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "allowed " : "notallowd");
    }
}
