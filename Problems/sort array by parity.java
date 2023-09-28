class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Move left pointer to the right until we find an odd number
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Move right pointer to the left until we find an even number
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }

            // Swap the even and odd elements
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        return nums;
    }
}
