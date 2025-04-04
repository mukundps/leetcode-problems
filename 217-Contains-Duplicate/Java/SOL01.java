// <TimeLimitExceeded>
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;

        for(int i = 0; i < length; i++){
            for (int j = 1; j < length; j++){
                if( i != j && nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
