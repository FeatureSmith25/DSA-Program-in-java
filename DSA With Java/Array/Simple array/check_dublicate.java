public class check_dublicate{
    public static void check(int a[], int n){
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            int ele=a[i];
            b[0]=1;
            if(b[ele]==1) b[ele]=0;
            else b[ele]=1;
        }
        for(int i=0;i<n;i++){
            if(b[i]==0)
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,4,3,2,5};
        int n=a.length;
        check(a, n);
    }
}