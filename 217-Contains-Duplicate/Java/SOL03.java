class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> items = new HashMap<>();
        for (int num:nums) {
            if (items.containsKey(num) && items.get(num) >= 1)
                return true;
            items.put(num, items.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
