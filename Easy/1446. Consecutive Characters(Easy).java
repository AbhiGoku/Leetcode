package Leetcode;
class Solution {
  public int maxPower(String s) {
    int count = 0;
    int power = 1;
    char c = s.charAt(0);
    for (char ch : s.toCharArray()) {
      if (c == ch) {
        count++;
      } else {
        power = Math.max(count, power);
        count = 1;
        c = ch;
      }
    }
    return Math.max(count, power);
  }
}