class Solution {
  public int[] twoSum(int[] nums, int target) {
      int one = -1;
      int two = -1;
      for( int i = 0; i < nums.length; i++){
          for( int j = 1; j < nums.length; j++){
              if(nums[i] + nums[j] == target && i != j){
                  one = i;
                  two = j;
              }
          }
      }
      int[] solution = {one, two};
      return solution;
  }
}
