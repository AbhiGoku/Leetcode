import java.util.Stack;

class Solution {
  public boolean isValid(String st) {
    Stack<Character> s = new Stack<>();
    for (char c : st.toCharArray()) {
      if (c == '(') {
        s.push(')');
      } else if (c == '{') {
        s.push('}');
      } else if (c == '[') {
        s.push(']');
      } else {
        if (s.isEmpty() || s.pop() != c) {
          return false;
        }
      }
    }
    return s.isEmpty();
  }
}