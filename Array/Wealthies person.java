class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int maxWealth = 0;
        int[] sumF = new int[row]; 
        for(int i = 0 ; i < row; i++) {
            int sum = 0;
            for(int j = 0 ; j < col; j++) {
                sum+=accounts[i][j];
            }
            sumF[i] = sum;
        }
        int max = sumF[0];
        for(int i = 1 ; i < row; i++) {
            if(max < sumF[i]) {
                max = sumF[i];
            }
        }
        return max;
    }
}
