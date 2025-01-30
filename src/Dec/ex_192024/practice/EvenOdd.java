package Dec.ex_192024.practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("print the even or odd no");
        int i = sc.nextInt();

        if(i%2==0){
            System.out.println("no is even");
        }else {
            System.out.println("No is odd");
        }

}

}
