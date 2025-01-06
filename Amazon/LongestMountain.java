package Amazon;

public class LongestMountain {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n<3){
            return 0;
        }
        int st = -1, end = -1;
        int ans = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                if(end!=-1){
                    st = -1;
                    end = -1;
                } 
                if(st==-1){
                    st = i;
                }
            } else{
                if(arr[i+1]<arr[i]){
                    if(st!=-1){
                        end = i+1;
                    }
                    if(st!=-1 && end!=-1){
                        ans = Math.max(ans, end-st+1);
                    }
                } else{
                    st = -1;
                    end = -1;
                }
            }
        }
        if(st!=-1 && end!=-1){
            ans = Math.max(ans, end-st+1);
        }
        return ans;
    }
}
