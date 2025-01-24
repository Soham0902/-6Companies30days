package Walmart;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindSubsequenceOfLengthKWithLargestSum {
     public int[] maxSubsequence(int[] a, int k){
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(n -> n[0]));
        for(int i = 0; i < a.length; i++){
            q.offer(new int[]{a[i], i});
            if(q.size() > k)
                q.remove();
        }
        return q.stream().sorted(Comparator.comparingInt(n -> n[1])).mapToInt(n -> n[0]).toArray();
    }
}
