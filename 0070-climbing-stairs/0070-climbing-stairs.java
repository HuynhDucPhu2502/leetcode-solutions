class Solution {
    public int climbStairs(int n) {
        int maxCountTwoStep = n / 2;
        long res = 0;

        for (int i = 0; i <= maxCountTwoStep; ++i) {
            int totalClimbTurn = n - i;
            res += c(totalClimbTurn, i);
        }

        return (int) res;
    }

    public static long c(int n, int k) {
        if (k < 0 || k > n) return 0;

        k = Math.min(k, n - k);

        long result = 1;

        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }
}