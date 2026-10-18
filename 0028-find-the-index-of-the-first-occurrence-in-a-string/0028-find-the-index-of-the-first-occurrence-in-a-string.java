class Solution {
    public int strStr(String haystack, String needle) {
        int haystackSize = haystack.length();
        int needleSize = needle.length();

        if (haystackSize < needleSize) return -1;

        for (int i = 0; i < haystackSize; i++) {

            if (haystack.charAt(i) == needle.charAt(0)
                    && (i + needleSize - 1) < haystackSize) {

                boolean matchFlag = true;
                for (int y = 0; y < needleSize; y++) {
                    if (haystack.charAt(i + y) != needle.charAt(y)) {
                         matchFlag = false;
                         break;
                    }
                }

                if (matchFlag) return i;
            }
        }

        return -1;
    }
}