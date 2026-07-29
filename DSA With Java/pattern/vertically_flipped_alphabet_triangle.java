import java.util.Scanner;

public class vertically_flipped_alphabet_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        char k='A';
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=line;j++)
            {
                if((i+j)>line)
                {
                    System.out.print(k+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            k++;
            System.out.println();
        }   
    }      
}