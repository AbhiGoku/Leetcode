class Solution {
  public boolean isCircularSentence(String sentence) {
    String[] s = sentence.split("\\s+");
    if (s.length == 1) {
      return s[0].charAt(0) == s[0].charAt(s[0].length() - 1);
    }
    char prev = s[0].charAt(s[0].length() - 1);

    for (int i = 1; i < s.length; i++) {
      if (prev == s[i].charAt(0)) {
        prev = s[i].charAt(s[i].length() - 1);
      } else {
        return false;
      }
    }
    if (s[0].charAt(0) != s[s.length - 1].charAt(s[s.length - 1].length() - 1)) {
      return false;
    }
    return true;
  }
}