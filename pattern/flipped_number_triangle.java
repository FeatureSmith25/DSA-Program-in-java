import java.util.Scanner;

public class flipped_number_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=0;i<=line;i++){
            for(int j=line;j>i;j--){
                System.out.print(line-j+1+" ");
            }
            System.out.println();
        }
    }   
}