package GoldmanSachs;

import java.util.HashSet;

public class MinimizeTheMaximumOfTwoArrays {
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        HashSet<Integer>set = new HashSet<>();
        int i=0;
        int num = 0;
        boolean len = true;
        while(len){
            if(num%divisor1!=0){
                i++;
                set.add(++num);
            }
            if(i==uniqueCnt1){
                len = false;
                break;
            }
        }
        int num2 = 1;
        int j=0;
        while(len){
            if(num2%divisor2!=0 && !set.contains(num2)){
                num2++;
                j++;
            }
            if(j==uniqueCnt2){
                len = false;
                break;
            }
        }
        return Math.max(num,num2);
    }
}
