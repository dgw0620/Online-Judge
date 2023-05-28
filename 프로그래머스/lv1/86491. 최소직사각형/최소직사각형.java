class Solution {
    public int swap (int a, int b) {
        return a;
    }
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i ++){
            if (sizes[i][1] > sizes[i][0])
                sizes[i][1] = swap(sizes[i][0], sizes[i][0] = sizes[i][1]);
        }
        
        int[] max = new int[2];
        for (int[] i : sizes) {
            if (max[0] < i[0])
                max[0] = i[0];
            if (max[1] < i[1])
                max[1] = i[1];
        }
        
        return max[0] * max[1];
    }
}