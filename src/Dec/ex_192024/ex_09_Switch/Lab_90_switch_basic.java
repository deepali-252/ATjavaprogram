package Dec.ex_192024.ex_09_Switch;

import java.util.Scanner;

public class Lab_90_switch_basic {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("find out the bestcase");
        int a = sc.nextInt();

        switch(a){
            case 1 :
                System.out.println("mon");
                break ;
            case 2 :
                System.out.println("tue");
                break ;
            case 3 :
                System.out.println("wed");
                break ;
            case 4 :
                System.out.println("thus");
                break ;
            case 5 :
                System.out.println("friday");
                break ;
            case 6 :
                System.out.println("saturday");
                break ;
            case 7 :
                System.out.println("sun");
                break ;

            default:
                System.out.println("NO idea what is the day");
                break;
        }
    }
}
