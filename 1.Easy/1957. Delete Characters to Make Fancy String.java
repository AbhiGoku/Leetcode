class Solution {
  public String makeFancyString(String s) {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    char prev = ' ';
    for (char c : s.toCharArray()) {
      if (prev == c) {
        count++;
        if (count >= 3) {
          continue;
        } else {
          sb.append(c);
        }
      } else {
        prev = c;
        count = 1;
        sb.append(c);
      }
    }
    return sb.toString();
  }
}