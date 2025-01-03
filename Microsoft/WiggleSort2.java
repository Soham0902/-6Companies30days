package Microsoft;

import java.util.Arrays;

public class WiggleSort2 {
    public void wiggleSort(int[] nums) {
        int temp [] = nums.clone();
        Arrays.sort(temp);
        int mid = (nums.length+1)/2;
        int j = mid-1;
        int k = nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = temp[j--];
            } else{
                nums[i] = temp[k--];
            }
        }
    }
}
