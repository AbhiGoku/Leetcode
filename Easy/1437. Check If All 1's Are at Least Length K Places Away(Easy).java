package Leetcode.Easy;
class Solution {
  public boolean kLengthApart(int[] nums, int k) {
    int count = Integer.MIN_VALUE;
    boolean distance = true;
    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {
        if (count == Integer.MIN_VALUE) {
          count = i;
        } else {
          if (i - count <= k) {
            distance = false;
            break;
          }
          count = i;
        }
      }
    }
    return distance;
  }
}