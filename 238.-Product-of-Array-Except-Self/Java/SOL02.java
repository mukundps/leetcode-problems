class Solution {
  public int[] productExceptSelf(int[] nums) {
    int l = nums.length, right = 1, i;
    int[] sol = new int[l];
    sol[0] = 1;
    for (i = 1; i < l; i++){
      sol[i] = sol[i-1]*nums[i-1];
    }
    for (i = l-1; i >= 0; i--){
      sol[i] *= right;
      right *= nums[i];
    }
    return sol;
  }
}
