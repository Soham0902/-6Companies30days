package Microsoft;

public class CountNoOfNiceSubArrays {
    public int numberOfSubarrays(int[] nums, int k) {
        // if we calculate sum of atmost k and sum of atmost k-1 we get exact sum of k
        return atMax(nums, k) - atMax(nums, k-1);  
    }

    private int atMax(int nums[], int k){
        int l=0,r=0, count = 0, subarray = 0;
        while(r<nums.length){
            count+=(nums[r]%2);
            while(count>k){
                count-=(nums[l]%2);
                l++;
            }
            subarray+= (r-l+1);
            r++;
        }
        return subarray;
    }
}
