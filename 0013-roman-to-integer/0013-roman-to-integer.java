class Solution {
    public int romanToInt(String s) {
        Stack<Integer> addUpStack = new Stack<>();

        char[] sChars = s.toCharArray();
        for (char sChar : sChars) {

            int symbolValue = convertRomanSymbolToInt(sChar);

            if (addUpStack.isEmpty() || addUpStack.peek() >= symbolValue)
                addUpStack.push(symbolValue);
            else {
                int valueToUpdate = symbolValue - addUpStack.pop();
                addUpStack.push(valueToUpdate);
            }
        }

        int res = 0;
        while (!addUpStack.isEmpty()) {
            res += addUpStack.pop();
        }

        return res;
    }


    public int convertRomanSymbolToInt(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}