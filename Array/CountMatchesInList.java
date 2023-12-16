import java.util.*;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int keyIndex = -1;

        if (ruleKey.equals("type")) {
            keyIndex = 0;
        } else if (ruleKey.equals("color")) {
            keyIndex = 1;
        } else if (ruleKey.equals("name")) {
            keyIndex = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            if (ruleValue.equals(item.get(keyIndex))) {
                count++;
            }
        }
        return count;
    }
}
