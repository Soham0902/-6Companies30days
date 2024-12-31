package Microsoft;

import java.util.Arrays;

class MinimumMovesToEqualElementsII{
    public int minMoves2(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int num = nums[n/2];
        for(int a : nums){
            count+= Math.abs(num-a);
        }
        return count;
    }
}