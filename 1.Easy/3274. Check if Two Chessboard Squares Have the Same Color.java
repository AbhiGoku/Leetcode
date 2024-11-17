class Solution {
  public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
    // 1st check
    boolean check1 = colorCheck(coordinate1);
    boolean check2 = colorCheck(coordinate2);
    return check1 == check2;
  }

  private boolean colorCheck(String s) {
    char c1 = s.charAt(0);
    char c2 = s.charAt(1);
    int c11 = c1 - 'a' + 1;
    int c22 = c2 - '0';

    // 11-black, 12-white, 21-white, 22-black
    // black-false, white-true
    if (c11 % 2 == 0) {
      if (c22 % 2 == 0) {
        return false;
      } else {
        return true;
      }
    } else {
      if (c22 % 2 == 0) {
        return true;
      } else {
        return false;
      }
    }
  }
}