import java.util.Arrays;
import java.util.Collections;

class Solution2{
    public static int binarySearch(int[] arr, int Item) {
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        int Index = -1;
        while (left < right && !found) {
            int mid = (left + right) / 2;
            if (arr[mid] == Item) {
                Index = mid;
                found = true;
            }
            else {
                if (Item < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        if (found)
            return Index;
        else
            return -1;
    }
    public static int[] findSum(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int Index = binarySearch(nums, k - nums[i]);
            if (Index != -1 && Index != i) {
                return new int[]{nums[i], k - nums[i]};
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[][] inputs = {{1, 2, 3, 4},
                {1, 2},
                {2, 2},
                {-4, -1, -9, 1, -7},
                {25, 50, 75, 100, 400}};

        int[] k = {5, 3, 4, -3, 425};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tArray: " + Arrays.toString(inputs[i]));
            System.out.println("\tk: " + k[i]);

            int[] result = findSum(inputs[i], k[i]);
            System.out.println("\n\tResult: " + Arrays.toString(result));
            System.out.println('-' + String.join("", Collections.nCopies(100, "-")) + '\n');
        }
    }
}
