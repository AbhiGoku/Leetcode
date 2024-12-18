class Solution {
  public int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    int start = left;
    left = 0;
    right = nums.length - 1;
    if (nums[start] == target) {
      return start;
    }
    if (target >= nums[start] && target <= nums[right]) {
      left = start;
    } else {
      right = start;
    }
    System.out.println("start:" + start);
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;

  }
}
