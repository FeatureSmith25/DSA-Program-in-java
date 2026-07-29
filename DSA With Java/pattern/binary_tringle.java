import java.util.Scanner;

public class binary_tringle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(0+" ");
                }
                else
                {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }   
}