class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedStr = s.trim();
        int trimmedStrLengthIndex = trimmedStr.length() - 1;

        char i = trimmedStr.charAt(trimmedStrLengthIndex);
        int res = 0;

        while (i != ' ' && res <= trimmedStrLengthIndex) {
            res++;  
            
            if (res <= trimmedStrLengthIndex)
                i = trimmedStr.charAt(trimmedStrLengthIndex - res);
        }

        return res;
    }
}