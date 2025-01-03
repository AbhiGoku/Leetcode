class Solution {
  public int findDuplicate(int[] nums) {
    int fast = 0;
    int slow = 0;

    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    slow = 0;
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }
}
