public class merging_soted_array_using_magic {
    public static void merge(int a[],  int b[], int c[]){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }

    public static void merge_sort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++) a[i]=arr[idx++];
        for(int i=0;i<b.length;i++) b[i]=arr[idx++];
        merge_sort(a);
        merge_sort(b);
        merge(a, b, arr);

    }
    public static void main(String[] args) {
        int[] arr={5,2,8,4,1,6,7};
        merge_sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }   
}