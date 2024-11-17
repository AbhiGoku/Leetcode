
import java.util.ArrayList;

class Solution {
  public String[] findWords(String[] words) {
    String first = "qwertyuiop";
    String second = "asdfghjkl";
    String third = "zxcvbnm";
    ArrayList<String> result = new ArrayList<>();

    for (String s : words) {
      char ch = Character.toLowerCase(s.charAt(0)); // Normalize case
      if (first.indexOf(ch) >= 0 && result(s.toLowerCase(), first)) {
        result.add(s);
      } else if (second.indexOf(ch) >= 0 && result(s.toLowerCase(), second)) {
        result.add(s);
      } else if (third.indexOf(ch) >= 0 && result(s.toLowerCase(), third)) {
        result.add(s);
      }
    }

    // Convert ArrayList to String array
    String[] res = new String[result.size()];
    result.toArray(res); // Fill the res array

    return res;
  }

  private boolean result(String s, String first) {
    for (char c : s.toCharArray()) {
      if (first.indexOf(c) == -1) {
        return false;
      }
    }
    return true;
  }
}
