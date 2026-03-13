import java.util.Scanner;

public class bridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=0;i<line*2-1;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0;i<line-1;i++)
        {
            for(int j=0;j<line-i-1;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<=2*i;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<line-i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}