public class arrayOfindex {
    public static void main(String[] args) {
        int[] arr={5,1,8,2,3,7,0,4,6};
        int i=0;
        int n=arr.length;
        while(i<n){
            if(arr[i]==i){
                i++;
            }
            else{
                int idx=arr[i];
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            }
        }
        for(int ele:arr)
            System.out.print(ele+" ");
    }
}