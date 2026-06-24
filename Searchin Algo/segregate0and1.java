import java.util.Scanner;
public class segregate0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k=0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int p=0;
        int q=n-1;
        while(p<q){
            if(arr[p]==0) p++;
            if(arr[q]==1) q--;
            if(p>q) break;
            if(arr[p]==1&&arr[q]==0){
                arr[p]=0;
                arr[q]=1;
                p++;
                q--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }  
} 