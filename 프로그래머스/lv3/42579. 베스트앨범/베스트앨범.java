import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            if(map.containsKey(genres[i])) {
                List<Integer> list = map.get(genres[i]);
                list.set(0, list.get(0) + plays[i]);
                if (list.get(2) < plays[i]) {
                    list.set(3, list.get(1));
                    list.set(4, list.get(2));
                    list.set(1, i);
                    list.set(2, plays[i]);
                } else if (list.get(4) < plays[i]) {
                    list.set(3, i);
                    list.set(4, plays[i]);
                }
                map.put(genres[i], list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(plays[i]);
                list.add(i);
                list.add(plays[i]);
                list.add(0);
                list.add(0);
                map.put(genres[i], list);
            }
        }
        
        List<Map.Entry<String, List<Integer>>> ent = new ArrayList<>(map.entrySet());
        
        Collections.sort(ent, Comparator.comparingInt((Map.Entry<String, List<Integer>> e) -> e.getValue().get(0)).reversed());
        
        List<Integer> answer = new ArrayList<>();
        
        for (Map.Entry<String, List<Integer>> e : ent) {
            List<Integer> value = e.getValue();
            if (value.get(4) != 0) {
                answer.add(value.get(1));
                answer.add(value.get(3));
            } else {
                answer.add(value.get(1));
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}