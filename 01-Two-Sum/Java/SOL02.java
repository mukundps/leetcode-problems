class Solution {
  public int[] twoSum(int[] nums, int target) {
      int one = -1;
      int two = -1;
      int index = 0;
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for(index=0; index < nums.length; index++){
          hashMap.put(nums[index], index);
      }
      for(index=0; index < nums.length; index++){
          int first = nums[index];
          int second = target-first;
          if( hashMap.containsKey(second) && hashMap.get(second) != index){
              one = index;
              two = hashMap.get(second);
              break;
          }
      }
      int[] solution = {one, two};
      return solution;
  }
}
