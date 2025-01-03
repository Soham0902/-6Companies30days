package Microsoft;

import java.util.*;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        for(int i=0;i<s.length()-9;i++){
            String ten = s.substring(i,i+10);
            if(!seen.add(ten)){
                repeated.add(ten);
            }
        }
        return new ArrayList(repeated);
    }
}
