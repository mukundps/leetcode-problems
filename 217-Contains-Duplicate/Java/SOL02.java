class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < length; i++)
            if ( nums[i-1] == nums[i])
                return true;
        return false;
    }
}
