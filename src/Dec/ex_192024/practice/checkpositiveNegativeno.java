package Dec.ex_192024.practice;

import java.util.Scanner;

public class checkpositiveNegativeno {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the no");
          int num =     sc.nextInt();

          if(num>0){
              System.out.println("Number is positive");
          }else {
              System.out.println("Number is negative");
          }

    }
}
