class Solution {
    public int mostWordsFound(String[] sentences) {
        int count[] = new int[sentences.length];
        int ct = 0;
        for(int i = 0 ; i < sentences.length; i++) {
            String [] parts = sentences[i].split(" ");
            count[i] = parts.length;
        }
        int max = count[0];
        for(int i = 1; i < sentences.length; i++) {
            if(max < count[i]) {
                max = count[i];
            }
        }
        return max;
    }
}
