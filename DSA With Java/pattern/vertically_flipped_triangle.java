import java.util.Scanner;

public class vertically_flipped_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=line;j++)
            {
                if((i+j)>line)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }   
    }   
}