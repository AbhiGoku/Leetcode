
package Leetcode;

import java.util.*;

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list = new ArrayList<>();
    int len = nums.length;
    boolean num[] = new boolean[len + 1];
    for (int i = 0; i < nums.length; i++) {
      num[nums[i]] = true;
    }

    for (int i = 1; i < num.length; i++) {
      if (!num[i]) {
        list.add(i);
      }
    }
    return list;
  }
}