import java.util.*;
public class a_raised_power_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the base: ");
        a=sc.nextInt();
        System.out.print("Enter the Exponent: ");
        b=sc.nextInt();
        System.out.println(a+" raised the power"+b+" is "+power(a, b));
    }   
    public static int power(int a, int b){
        if(b==0) return 1;
        return a*power(a,b-1);
    }
}