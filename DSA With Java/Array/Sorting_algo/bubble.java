// package Sorting_algo;
public class bubble {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 5, -2, 6, 7, 2, 8, 7, 3 };
        int n = arr.length;
        print(arr);
        for (int i = 0; i <= n - 1; i++){
            int swaps = 0;
            for (int j = 0; j < n - 1; j++){
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps==0) break;
        }
        print(arr);
    }
} 