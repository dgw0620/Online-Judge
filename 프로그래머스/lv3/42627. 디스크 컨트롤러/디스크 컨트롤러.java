import java.util.*;

class Work implements Comparable<Work> {
    private int start;
    private int working;
    
    public Work(int start, int working) {
        this.start = start;
        this.working = working;
    }
    
    public int getStart() {
        return this.start;
    }
    
    public int getWorking() {
        return this.working;
    }
    
    @Override
    public int compareTo(Work other) {
        return Integer.compare(this.working, other.working);        
    }
}

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Work> heap = new PriorityQueue<>();
        Arrays.sort(jobs, (s1, s2) -> s1[0] - s2[0]);
        
        int i = 0;
        int time = 0;
        while(i < jobs.length || !heap.isEmpty()) {
            for (; i < jobs.length && jobs[i][0] <= time; i++) {
                heap.add(new Work(jobs[i][0], jobs[i][1]));
            }
            
            if (!heap.isEmpty()) {
                Work now = heap.poll();
                time += now.getWorking();
                answer += time - now.getStart();
            } else {
                time++;
            }
        }

        return answer / jobs.length;
    }
}