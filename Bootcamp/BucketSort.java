import java.util.*;

public class BucketSort {
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0)
            return;

        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new List[n];
        for (int i = 0; i < n; i++)
            buckets[i] = new ArrayList<>();

        for (float value : arr) {
            int index = (int)(value * n);
            buckets[index].add(value);
        }

        for (List<Float> bucket : buckets)
            Collections.sort(bucket);

        int idx = 0;
        for (List<Float> bucket : buckets) {
            for (float value : bucket)
                arr[idx++] = value;
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.123f, 0.665f, 0.343f};
        bucketSort(arr);
        for (float num : arr)
            System.out.print(num + " ");
    }
}
