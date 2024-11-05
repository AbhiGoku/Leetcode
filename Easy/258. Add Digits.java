class Solution {
  public int addDigits(int num) {
    while (num >= 10) {
      num = add(num);
    }
    return num;
  }

  private int add(int num) {
    int val = num;
    int result = 0;
    while (val > 0) {
      result += val % 10;
      val /= 10;
    }
    return result;
  }
}