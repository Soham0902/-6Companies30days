package Atlassian;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountWordsObtainedAfterAddingALetter {
    public int wordCount(String[] startWords, String[] targetWords) {
        int n = startWords.length;
        int count = 0;
        Set<String> set = new HashSet<>();
        
        for(String start: startWords){
            char[] sA = start.toCharArray();
            Arrays.sort(sA);
            set.add(new String(sA));
        }
        int m = targetWords.length;
        boolean ans = false;
        for(int i = 0; i < m; i++){
            char[] tA = targetWords[i].toCharArray();
            Arrays.sort(tA);
            int k = tA.length;
            String s = String.valueOf(tA);
            
            ans = false;
            for(int j = 0; j < k; j++){
                String str = s.substring(0,j) + s.substring(j+1);
                if(set.contains(str)){
                    count++;
                    break;
                }
            }
        }
        return count;    
    }
}
