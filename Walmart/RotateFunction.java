package Walmart;

public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int maxVal, sum = 0, f0 = 0, curr,prev,n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            f0+=i*nums[i];
        }
        maxVal = f0;
        prev = f0;
        for(int i=1;i<n;i++){
            curr=prev+sum-n*nums[n-i];
            prev = curr;
            maxVal = Math.max(curr,maxVal);
        }
        return maxVal;
    }
}
