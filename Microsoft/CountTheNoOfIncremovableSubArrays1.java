package Microsoft;

public class CountTheNoOfIncremovableSubArrays1 {
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(isIncreasingSubArray(nums,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isIncreasingSubArray(int arr[], int start, int end){
        int prev = 0;
        for(int i=0;i<arr.length;i++){
            if(i<=end && i>= start){
                continue;
            }

            if(arr[i]<=prev){
                return false;
            }

            prev = arr[i];
        }
        return true;
    }
}
