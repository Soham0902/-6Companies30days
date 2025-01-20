package GoldmanSachs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeePriorityScheme {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (List<String> aT: access_times) {
            String employee = aT.get(0);
            int time = Integer.valueOf(aT.get(1).substring(0, 2)) * 60 + Integer.valueOf(aT.get(1).substring(2, 4));
            map.putIfAbsent(employee, new ArrayList<>());
            map.get(employee).add(time);
        }
        for (String employee: map.keySet()) {
            List<Integer> time = map.get(employee);
            Collections.sort(time);
            for (int i = 0; i < time.size() - 2; i ++) {
                if (time.get(i + 2) - time.get(i) <= 59) {
                    res.add(employee);
                    break;
                }
            }
        }
        return res;
    }
}
