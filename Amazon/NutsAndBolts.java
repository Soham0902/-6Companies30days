package Amazon;

public class NutsAndBolts {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        int freq[] = new int[256];
        for(char c : nuts){
            freq[(int) c ]++;
        }
        
        int j = 0;
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                nuts[j] = (char)i;
                bolts[j] = (char) i;
                j++;
            }
        }
    }
}
