package Walmart;

import java.util.*;

public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                if (k == 0 && map.get(num) == 1) {
                    result++;
                }
                map.put(num, map.get(num) + 1);
            } else {
                if (map.containsKey(num - k)) {
                    result++;
                }
                if (map.containsKey(num + k)) {
                    result++;
                }
                map.put(num, 1);
            }
        }
        return result;
    }
}