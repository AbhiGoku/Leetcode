class Solution {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    // best case scenario is not even gonna let the control go inside the if
    // condition.
    if (k != 0) {
      int[] arr = new int[nums.length];
      // first feed
      int start = nums.length - k;
      int j = 0;
      for (int i = start; i < nums.length; i++) {
        arr[j++] = nums[i];
      }
      // second feed
      for (int i = 0; i < start; i++) {
        arr[j++] = nums[i];
      }
      for (int i = 0; i < nums.length; i++) {
        nums[i] = arr[i];
      }
    }

    // if(nums.length != k){
    // reverse(nums,0,nums.length-1);
    // reverse(nums,0,k-1);
    // reverse(nums,k,nums.length-1);
    // }
    // }
    // public void reverse(int []nums, int start, int end){
    // int temp;
    // while(start<end){
    // temp = nums[start];
    // nums[start] = nums[end];
    // nums[end]=temp;
    // start++;
    // end--;
    // }
  }
}