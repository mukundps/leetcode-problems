class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    int length = nums.length;
    int index = 0;
    ArrayList<Integer> solution = new ArrayList<Integer>();
    HashMap<Integer, Integer> set = new HashMap<>();
    while(index < length){
      set.put(nums[index], index);
      index += 1;
    }
    index = 1;
    while(index <= length){
      if(!set.containsKey(index))
        solution.add(index);
      index+=1;
    }
    return solution;
  }
}
