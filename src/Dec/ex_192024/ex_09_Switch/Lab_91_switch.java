package Dec.ex_192024.ex_09_Switch;

import java.util.Scanner;

public class Lab_91_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("select the broswer");
        String browser = sc.nextLine();

        switch(browser){
            case "chrome":
                System.out.println("chorme is selected");
                break ;
            case "Firefox":
                System.out.println("Firefox is selected");
                break ;
            case "safari":
                System.out.println("Safari is selected");
                break ;
            default:
                System.out.println("out of browser");
                break ;


        }
    }
}
