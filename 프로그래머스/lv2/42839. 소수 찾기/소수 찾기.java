import java.util.*;

class Solution {
    HashSet<Integer> numSet = new HashSet<>();
    public int solution(String numbers) {
        int count = 0;
        recursive("", numbers);
        
        for (int p : numSet) {
            if (isPrime(p)) count++;
        }
        
        return count;
    }
    
    public void recursive (String comb, String others) {
        if (!comb.equals(""))
            numSet.add(Integer.parseInt(comb));
        
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }
    
    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i+= 2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}