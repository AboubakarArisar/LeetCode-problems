class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(!(i == nums.length-1)){
            if(nums[i] == target){
                idx = i;
                break;
            }
            else if(target > nums[i] && target < nums[i+1]){
                idx = i+1;
                break;
            }
            else if(target < nums[i]){
                idx = i;
                break;
            }
            }
            else{
                if(target == nums[i]){
                    idx = i;
                    break;
                }
                else if(target < nums[i]){
                    idx = i;
                    break;
                }
                else{
                        idx = nums.length;
                        break;
                }
            }
        }
        return idx;
    }
}
