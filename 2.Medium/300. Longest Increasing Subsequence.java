class Solution {
  public int lengthOfLIS(int[] nums) {
    int[] memo = new int[nums.length];

    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j <= i; j++) {
        if (nums[i] > nums[j]) {
          if (memo[i] < memo[j] + 1) {
            memo[i] = memo[j] + 1;
          }
        }
      }
    }
    int max = 0;
    for (int i : memo) {
      max = Math.max(max, i);
    }
    return max + 1;
  }
}