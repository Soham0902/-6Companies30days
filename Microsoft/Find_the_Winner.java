package Microsoft;
// link of the problem : https://leetcode.com/problems/find-the-winner-of-the-circular-game/
class Find_the_Winner{
    public int findthewinner(int n, int k){
        int winner = 0;
        for(int i=1;i<=n;i++){
            winner = (winner+k)%i;
        }
        return winner+1;
    }
}