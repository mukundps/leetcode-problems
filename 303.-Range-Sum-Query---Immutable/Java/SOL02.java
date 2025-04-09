class NumArray {
  private int[] num;

  public NumArray(int[] nums) {
    this.num = nums;
    for (int i = 1; i < num.length; i++) {
      num[i] += num[i-1];
    }
  }

  public int sumRange(int left, int right) {
    if (left == 0)
      return num[right];
    return num[right] - num[left-1];
  }
}

/**
* Your NumArray object will be instantiated and called as such:
* NumArray obj = new NumArray(nums);
* int param_1 = obj.sumRange(left,right);
*/
