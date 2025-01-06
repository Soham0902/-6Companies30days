package Amazon;

import java.util.HashMap;

public class MaximumSumOfDistinctSubarrayOfLenK{
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, maximum = 0;
        int l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            if (r - l + 1 == k) {
                if (map.size() == k) {
                    maximum = Math.max(maximum, sum);
                }
                sum -= nums[l];
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }
        }
        return maximum;
    }
}