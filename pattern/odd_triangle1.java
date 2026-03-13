import java.util.Scanner;

public class odd_triangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int a=1;
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }   
    }
}