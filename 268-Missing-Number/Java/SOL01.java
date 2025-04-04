class Solution {
  public int missingNumber(int[] nums) {
      int length = nums.length;
      int index = 0, solution = 0;
      HashMap<Integer, Integer> set = new HashMap<>();
      if(length == 1 && nums[0] == 0){
          return 1;
      }
      else{
          while(index < length){
              set.put(nums[index], index);
              index += 1;
          }
          index = 1;
          while(index <= length){
              if(!set.containsKey(index))
                  solution = index;
              index+=1;
          }
      }
      return solution;
  }
}
