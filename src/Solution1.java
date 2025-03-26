import java.util.Arrays;
import java.util.Collections;

class Solution1 {
    public static int[] findSum(int[] arr, int n) {
        int p1 = 0;
        int p2 = arr.length - 1;
        int result[] = new int[2];
        while (p1 < p2) {
            if (arr[p1] + arr[p2] < n) {
                p1++;
            } else if (arr[p1] + arr[p2] > n){
                p2--;
            } else {
                result[0] = arr[p1];
                result[1] = arr[p2];
                break;
            }
        }
        return result;
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