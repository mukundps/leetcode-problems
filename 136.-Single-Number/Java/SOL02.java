class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> set = new HashMap<>();
    for (int num:nums) {
      set.put(num, set.getOrDefault(num, 0) + 1);
    }
    for (int num:nums) {
      if (set.get(num) == 1)
        return num;
    }
    return -1;
  }
}