class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            // Shift existing elements to the right to make space
            for (int j = nums.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        
        return target;
    }
}
