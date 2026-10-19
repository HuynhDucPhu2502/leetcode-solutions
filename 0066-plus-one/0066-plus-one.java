class Solution {
    public int[] plusOne(int[] digits) {
        int remember = 0;
        int rightIndex = digits.length - 1;

        do {
            int number = digits[rightIndex] + remember;
            if (rightIndex == digits.length -1) number += 1;

            digits[rightIndex] = number % 10;
            remember = number / 10;
            rightIndex--;
        } while (remember != 0 && rightIndex >= 0);

        if (remember != 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = remember;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);

            return newDigits;

        } else return digits;
    }
}