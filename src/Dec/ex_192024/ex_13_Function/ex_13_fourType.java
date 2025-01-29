package Dec.ex_192024.ex_13_Function;

public class ex_13_fourType {
    public static void main(String[] args) {

// without return type without parameter
        geet();

        // with return type without parameter
        String n = name ();
        System.out.println(n);

        // without return type with parameter
          calculation("division");


          //with return type with parameter
          String offerletter = intrview("final around");
          System.out.println(offerletter);



    }
    // with return type with return type
    static String intrview(String mock){
        return mock ;

    }
// without return type with parameter
    static void calculation( String math) {
        System.out.println("This is calculation answer : " + math);
    }

    // with return type without parameter
    static String name() {
         return "deepali jadhav";

    }
        // without parameter without return type
        static void geet () {
            System.out.println("main apni fave hu");
        }
    }

