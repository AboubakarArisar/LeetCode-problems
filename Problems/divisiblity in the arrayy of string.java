class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] div = new int[n];
        int currNum = 0;

        for (int i = 0; i < n; i++) {
            currNum = (currNum * 10 + Character.getNumericValue(word.charAt(i))) % m;
            if (currNum == 0) {
                div[i] = 1;
            } else {
                div[i] = 0;
            }
        }

        return div;
    }
}
