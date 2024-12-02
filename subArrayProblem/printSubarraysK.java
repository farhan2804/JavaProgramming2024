
// I/P = arr = {3, 4, -7, 1, 3, 3, 1, -4}; k =7;
// // o/p-{3, 4}, {3, 4, -7, 1, 3, 3}, {1, 3, 3}, {3, 3, 1};
import java.util.HashMap;

class Main {
    public static void main(String args[]) {
        int arr[] = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int k = 7;
        subArrayEqualK(arr, k);

    }

    public static void subArrayEqualK(int arr[], int k) {
        int sum = 0;
        int startIndex = -1;
        int endIndex = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                startIndex = 0;
                endIndex = i;
                for (int j = startIndex; j <= endIndex; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            if (map.containsKey(sum - k)) {
                startIndex = map.get(sum - k) + 1;
                endIndex = i;
                for (int m = startIndex; m <= endIndex; m++) {
                    System.out.print(arr[m] + " ");
                }
                System.out.println();
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
    }
}
