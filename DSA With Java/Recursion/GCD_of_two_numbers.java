public class GCD_of_two_numbers {
    public static int GCD(int a, int b){
        if(a==0) return b;
        return GCD(b%a, a);
    }
    public static void main(String[] args) {
        int a=28;
        int b=8;
        System.out.println(GCD(a, b));
    }   
}