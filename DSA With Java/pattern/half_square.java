import java.util.Scanner;
public class half_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=2*line;i++)
        {
            for(int j=1;j<=2*line;j++)
            {
                if(i<=line)
                {
                    if(j<=line)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                if(i>line)
                {
                    if(j>line)
                        System.out.print("* ");
                    else
                        System.out.print("  ");

                }
            }
            System.out.println();
        }
    }   
}