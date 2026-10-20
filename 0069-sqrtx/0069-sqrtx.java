class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 0;
        int right = Math.min(x, 46340);
        int mid;

        while (left <= right) {

            mid = (left + right) / 2;
            long num = (long) mid * mid;


            if (num == x) return mid;
            else if (x > num) left = mid + 1;
            else right = mid - 1;
        }

        return Math.min(left, right);
    }
}