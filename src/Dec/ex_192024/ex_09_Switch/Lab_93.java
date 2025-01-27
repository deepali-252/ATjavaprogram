package Dec.ex_192024.ex_09_Switch;

public class Lab_93 {

    public static void main(String[] args) {

        int itemcode = 001;

        switch(itemcode){
            case 001 :
                System.out.println("its a laptop");
                break;
            case 002 :
                System.out.println("its a device");
                break ;
            default:
                System.out.println("no idea what is it");
                break;
        }
    }
}

