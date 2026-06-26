public class merge_two_sorted_array {
    public static void merge(int a[],  int b[], int c[]){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void main(String[] args) {
        int a[]={1,3,5,7,11,15};
        int b[]={4,6,8,13,17,19,21};
        int c[]= new int[a.length+b.length];
        merge(a, b, c);
        for( int ele:c){
            System.out.print(ele+" ");
        }
    }   
}