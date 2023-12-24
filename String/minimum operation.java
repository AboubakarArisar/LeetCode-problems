class Solution {
    public int minOperations(String s) {
        int operationsToMake0 = 0;
        for (int i = 0; i < s.length(); i++) {
            char expectedChar = (i % 2 == 0) ? '0' : '1';
            if (s.charAt(i) != expectedChar) {
                operationsToMake0++;
            }
        }

        int operationsToMake1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char expectedChar = (i % 2 == 0) ? '1' : '0';
            if (s.charAt(i) != expectedChar) {
                operationsToMake1++;
            }
        }

        return Math.min(operationsToMake0, operationsToMake1);
    }
}
