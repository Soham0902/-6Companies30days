package GoldmanSachs;

import java.util.Arrays;

public class NoOfWaysToReachPositionAfterExactKSteps {
    private int dp[][];
    private int mod= 1000000007;
    public int numberOfWays(int startPos, int endPos, int k) {
        dp= new int[3000][1005];
        for(var i:dp) Arrays.fill(i,-1);
        return ways(startPos,endPos,k);
    }
    int ways(int s,int e,int k){
        if(s==e && k==0) return 1;
        if(k==0) return 0;
        if(dp[s+1000][k]!=-1) return dp[s+1000][k];
        return dp[s+1000][k] = (ways(s-1,e,k-1) + ways(s+1,e,k-1))%mod;
    }
}
