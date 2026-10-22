class Solution {
    public int climbStairs(int n) {
        int maxCountStep2 = n / 2;

        long res = 0;

        for (int i = 0; i <= maxCountStep2; ++i) {
            int totalClimTurn = n - 2 * i + i;
            res += c(totalClimTurn, i);
        }

        return (int)res;
    }


    public static long c(long n, long k) {
        long result = 1;

        for (long i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }
}