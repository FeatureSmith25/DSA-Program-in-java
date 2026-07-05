import java.util.ArrayList;
import java.util.Collections;

public class bucket_sort {
    public static void main(String[] args) {
        int[] arr = { 42, 32, 33, 52, 37, 47, 51 };
        bucketSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void bucketSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int max = arr[0];
        int min = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        int bucketCount = (max - min) / arr.length + 1;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int value : arr) {
            int bucketIndex = (value - min) / arr.length;
            buckets.get(bucketIndex).add(value);
        }

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
    }
}
