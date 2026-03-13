import java.util.*;
public class p5 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of the lines:");
        int n=sc.nextInt(); 
        char a;
        for(int i=0;i<n;i++)
        {
            a='A';
            for(int j=0;j<i;j++)
            {
                System.out.print(" "+a);
                a++;
            }
            System.out.println();
        }
    }      
}