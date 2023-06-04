import java.util.*;

class Solution {
    public String solution(int[] numbers) {        
        String answer = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .sorted((s1, s2) -> s2.repeat(3).compareTo(s1.repeat(3)))
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
        
        return answer.replaceFirst("^0+", "").equals("") ? "0" : answer;
    }
}