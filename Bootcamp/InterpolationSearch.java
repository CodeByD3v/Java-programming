public class InterpolationSearch {

    // Interpolation search 
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            // Prevent division by zero
            if (arr[low] == arr[high]) {
                if (arr[low] == target)
                    return low;
                else
                    return -1;
            }

            // Estimates the position
            int pos = low + ((target - arr[low]) * (high - low)) / 
                      (arr[high] - arr[low]);

            // Checking if found
            if (arr[pos] == target)
                return pos;
            else if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }

    // Main
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 70;

        int index = interpolationSearch(data, target);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }
}
