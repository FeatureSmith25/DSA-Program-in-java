import java.util.Arrays;
public class two_sum {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 4, 3, 0, 8, 10 };
        int n = arr.length;
        int target = 9;
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            if (arr[i] + arr[j] == target){
                System.out.print(i + "," + j);
                i++;
                j--;
            }
            else if (arr[i] + arr[j] < target)
                i++;
            else
                j--;
        }
    }
}