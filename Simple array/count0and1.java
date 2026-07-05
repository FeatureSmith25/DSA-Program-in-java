import java.util.Scanner;

public class count0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int numberofzeros = 0;
        for(int ele : arr){
            if(ele == 0) {
                numberofzeros++;
            }
        }
        
        for(int i = 0; i < numberofzeros; i++){
            arr[i] = 0;
        }
        for(int i = numberofzeros; i < n; i++){
            arr[i] = 1;
        }
        
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        sc.close();
    }   
}
