class Solution {
  public boolean isPerfectSquare(int num) {
    if (num == 1) {
      return true;
    }
    boolean result = false;
    for (int i = 1; i <= num / 2; i++) {
      if (i * i == num) {
        result = true;
        break;
      } else {
        if (i * i > num) {
          break;
        }
      }
    }
    return result;
  }
}