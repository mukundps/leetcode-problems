class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> set = new HashMap<>();
    int len = nums.length;
    int index = 0, sol = 0;
    while( index < len ) {
      if( set.get(nums[index]) == null)
        set.put(nums[index], 1);
      else
        set.remove(nums[index], 1);
      index += 1;
    }
    for(Map.Entry<Integer, Integer> entry : set.entrySet()){
      if(entry.getValue() == 1)
        sol = entry.getKey();
    }
    return sol;
  }
}
