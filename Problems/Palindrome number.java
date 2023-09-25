class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0 ;
        int original = x;
        if(x < 0) return false; 
        while(x!=0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        
        return original == rev;
    }
}
