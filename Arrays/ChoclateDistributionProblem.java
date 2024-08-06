class Solution
{
    public long findMinDiff (ArrayList<Integer> A, int N, int M)
    {
        if (M == 0 || N == 0) {
            return 0;
        }
        
        if (M > N) {
            return -1; 
        }
        
       
        Collections.sort(A);
        
        long minDiff = Long.MAX_VALUE;
        
        
        for (int i = 0; i + M - 1 < N; i++) {
            long currentDiff = A.get(i + M - 1) - A.get(i);
            minDiff = Math.min(minDiff, currentDiff);
        }
        
        return minDiff;
    }
}