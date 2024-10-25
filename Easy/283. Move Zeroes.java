package Leetcode.Easy;

class Solution {
  public void moveZeroes(int[] nums) {
    int zero = 0;
    while (zero < nums.length) {
      if (nums[zero] == 0) {
        for (int i = zero; i < nums.length; i++) {
          // non zero value
          if (nums[i] != 0) {
            nums[zero] = nums[i];
            nums[i] = 0;
            break;
          }
        }
      } else {
        zero++;
      }
    }
  }
}