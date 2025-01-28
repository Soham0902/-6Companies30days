package GoldmanSachs;
import java.util.*;
public class FlipMatrix {
    class Solution {
        Map<Integer,Integer>map;
        int rows,cols,total;
        Random rand;
        public Solution(int m, int n) {
            map = new HashMap<>();
            rand = new Random();
            rows = m;
            cols = n;
            total = rows * cols;
        }
        
        public int[] flip() {
            int r = rand.nextInt(total--);
            int x = map.getOrDefault(r,r);
            map.put(r,map.getOrDefault(total,total));
            return new int[]{x/cols, x%cols};
        }
        
        public void reset() {
            map.clear();
            total = rows * cols;
        }
    }
    
    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(m, n);
     * int[] param_1 = obj.flip();
     * obj.reset();
     */
}
