import java.util.Scanner;
public class vertically_flipped_number_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int k=1;
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=line;j++)
            {
                if((i+j)>line)
                {
                    System.out.print(k+" ");
                    k++;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            k=1;
            System.out.println();
        }   
    }   
}