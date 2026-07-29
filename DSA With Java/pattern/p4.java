import java.util.*;
public class p4 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of the lines:");
        int n=sc.nextInt(); 
        char a='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" "+a);
                a++;
            }
            System.out.println();
        }
    }      
}