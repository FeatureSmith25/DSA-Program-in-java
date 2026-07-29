import java.util.Scanner;

public class horixontall_flipped_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int i=0;i<=line;i++){
            for(int j=line;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}