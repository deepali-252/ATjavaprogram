package Dec.ex_192024.ex_13_Function;

public class ex_13_task {
    public static void main(String[] args) {

      int result =  mul(23,45);
      System.out.println(result);

        int result2 =  add(23,45);
        System.out.println(result2);


        int result3 =  sub(23,45);
        System.out.println(result3);

        int result4 =  div(23,45);
        System.out.println(result4);



    }
    static int mul(int a , int b){
        return a * b ;
    }
    static int add(int a , int b){
        return a + b ;
    }
    static int sub(int a , int b){
        return a - b ;
    }
    static int div(int a , int b){
        return a % b ;
    }
}
