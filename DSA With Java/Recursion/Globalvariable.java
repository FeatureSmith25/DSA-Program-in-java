public class Globalvariable {
    static  int x = 10;

    public static void main(String[] args) {
        // int x=5;
        fun();
        System.out.println(x);

    }

    public static void fun() {
        x = 20;
    }
}