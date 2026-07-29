import java.util.Scanner;
public class hollow_verticle_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=line;j++)
            {
                if(j==1||j==i|j==line||i==1||i==line)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}