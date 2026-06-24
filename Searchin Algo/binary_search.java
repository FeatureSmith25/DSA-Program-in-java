public class binary_search {
    public static int binary(int arr[], int tar){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int idx=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>tar) right=mid-1;
            else if(arr[mid]<tar) left=mid+1;
            else{
                idx=mid;
                right=mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr={-76,-4,9,49,49,510,615,9911,99999};
        int target=49;
        int res=binary(arr,target);
        if(res==-1) System.out.print("Element is not found");
        else System.out.print("Element is found at index: "+res);
    }
}