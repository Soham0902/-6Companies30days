package Walmart;

import java.util.HashMap;
import java.util.Map;

public class FriendsOfApropriateAge {
    public int numFriendRequests(int[] ages) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int age : ages)
            map.put(age, map.getOrDefault(age, 0) + 1);
        int ans = 0;
        for (Integer a : map.keySet())
            for (Integer b : map.keySet())
                if (request(a, b)) ans += map.get(a) * (map.get(b) - (a == b ? 1 : 0));
        return ans;
    }

    private boolean request(int a, int b) {
        return !(b <= 0.5 * a + 7 || b > a || (b > 100 && a < 100));
    }
}
