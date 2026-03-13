import java.util.Scanner;

public class flipped_alphabet_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        char a='a';
        for(int i=0;i<=line;i++)
        {
            for(int j=line;j>i;j--){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
            a='a';
        }
    }   
}