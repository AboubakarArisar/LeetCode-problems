import java.util.*;

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int size = nums.size();
        List<Integer> indices = new ArrayList<Integer>();
        
        for (int i = 0; i < size; i++) {
            String binary = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    count++;
                }
            }
            if (count == k) {
                indices.add(i);
            }
        }

        int sum = 0;
        for (int index = 0 ; index < indices.size(); index++) {
            int idx = indices.get(index);
            int num = nums.get(idx);
            sum += num;
        }

        return sum;
    }
}
