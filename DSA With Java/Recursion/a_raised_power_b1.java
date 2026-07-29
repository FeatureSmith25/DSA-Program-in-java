import java.util.Scanner;

public class a_raised_power_b1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the base: ");
        a=sc.nextInt();
        System.out.print("Enter the Exponent: ");
        b=sc.nextInt();
        System.out.println(a+" raised the power "+b+" is: "+power(a, b));
    }   
    public static int power(int a, int b){
        if(b==0) return 1;
        int call = power(a, b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}