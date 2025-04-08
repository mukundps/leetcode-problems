class Solution {
  public int climbStairs(int n) {
    int first = 0, second = 1;
    while(n>0) {
      int temp = second;
      second += first;
      first = temp;
      n -= 1;
    }
    return second;
  }
}
