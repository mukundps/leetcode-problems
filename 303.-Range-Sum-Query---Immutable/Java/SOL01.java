class NumArray {
  private int[] num;

  public NumArray(int[] nums) {
    this.num = nums;
  }

  public int sumRange(int left, int right) {
    int sum = 0;
    while (right >= left) {
      sum += this.num[right];
      right -= 1;
    }
    return sum;
  }
}

/**
* Your NumArray object will be instantiated and called as such:
* NumArray obj = new NumArray(nums);
* int param_1 = obj.sumRange(left,right);
*/
