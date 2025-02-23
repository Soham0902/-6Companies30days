package GoldmanSachs;

public class FindConsecutiveIntegerFromDataStream{
    class DataStream {
        private int val, k, count;
        public DataStream(int value, int k) {
            this.val = value;
            this.k = k;
            this.count = 0;
        }
        
        public boolean consec(int num) {
            count = (num == val)? count+1 : 0;
            return count>=k;
        }
    }
    
    /**
     * Your DataStream object will be instantiated and called as such:
     * DataStream obj = new DataStream(value, k);
     * boolean param_1 = obj.consec(num);
     */
}
