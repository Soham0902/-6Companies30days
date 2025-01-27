package GoldmanSachs;
public class RunLengthEncoding {class Solution {
    public String encode(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int count = 1;
            sb.append(s.charAt(i));
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
        }
        return sb.toString();
    }
}
}
