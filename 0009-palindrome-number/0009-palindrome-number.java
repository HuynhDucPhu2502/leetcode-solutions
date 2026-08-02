class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;

        String xStr = String.valueOf(x);
        char[] xChars = xStr.toCharArray();

        int fullSize = xStr.length() - 1;
        int halfSize = fullSize / 2;

        for (int i = 0; i <= halfSize; ++i) {

            if (xChars[i] != xChars[fullSize - i])
                return false;
        }

        return true;
    }
}