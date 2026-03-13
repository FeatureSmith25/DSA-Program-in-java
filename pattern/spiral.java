import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=1;i<=2*line-1;i++)
        {
            for(int j=1;j<=2*line-1;j++)
            {
                int a=i,b=j;
                if(i>line) a=2*line-i;
                if(j>line) b=2*line-j;
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        }
    }
}