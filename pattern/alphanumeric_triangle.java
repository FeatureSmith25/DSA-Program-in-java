import java.util.Scanner;
public class alphanumeric_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        char a='A';
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print(j+1+" ");
                }
                else
                {
                    System.out.print(a+" ");
                    a++;
                }
            }
            a='A';
            System.out.println();
        }
    }   
}