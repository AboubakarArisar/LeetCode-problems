class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     String wordFirst = "";
     String wordTwo = ""; 
     for(int i = 0; i < word1.length; i++) {
        wordFirst = wordFirst.concat(word1[i]);
     }  
     
     for(int i = 0; i < word2.length; i++) {
        wordTwo = wordTwo.concat(word2[i]);
     }  

     return wordFirst.equals(wordTwo);
    }
}
