import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0 ; i < candies.length; i++) {
            if(candies[i]+extraCandies >= max) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;

    }
}
