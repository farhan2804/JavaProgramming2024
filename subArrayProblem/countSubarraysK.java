import java.util.HashMap;

class countSubarraysK {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1 };
        int k = 2;
        System.out.println("Number of Subarray's = " + countSubarray(arr, k));
    }

    public static int countSubarray(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}