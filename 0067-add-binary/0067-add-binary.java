class Solution {
    public String addBinary(String a, String b) {
        String longString = a.length() >= b.length()
                ? a
                : b;

        String smallString = a.length() >= b.length()
                ? b
                : a;

        int minSize = smallString.length() - 1;
        int maxSize = longString.length() - 1;

        int remember = 0;
        StringBuilder res = new StringBuilder();


        for (int i = 0; i <= maxSize; ++i) {

            int numA = Integer.parseInt(String.valueOf(longString.charAt(maxSize - i)));
            int numB = 0;

            if (i <= minSize)
                numB = Integer.parseInt(String.valueOf(smallString.charAt(minSize - i)));


            int total = numA + numB + remember;
            int totalBase2 = total % 2;
            remember = total / 2;

            res.append(totalBase2);

        }

        if (remember == 1)
            res.append("1");

        return res.reverse().toString();
    }
}