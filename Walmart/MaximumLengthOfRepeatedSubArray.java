package Walmart;

public class MaximumLengthOfRepeatedSubArray {
    public int findLength(int[] nums1, int[] nums2) {
        int dp[][] = new int[nums1.length+1][nums2.length+1];
        int max = 0;
        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<=nums2.length;j++){
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                max = Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}

//We use 2d dp memoization here. Create Matrix of [n+1] [m+1] and if the elements are equal add 1 to diagonal value and place it in dp[i][j]. Find the maximum
