package Dec.ex_192024.practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the palindrome ");
        String name = sc.nextLine();

        String reverd = "";
        for(int i = name.length()-1; i>=0 ; i--){
            reverd += name.charAt(i);
        }
        if(name.equals(reverd)){
            System.out.println("this string is palindrome");
        }
        else {
            System.out.println("this is not palindrome");
        }
    }
}
