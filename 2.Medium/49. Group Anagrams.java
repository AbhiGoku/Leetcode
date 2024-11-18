import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      char[] c = s.toCharArray();
      Arrays.sort(c);
      String sc = String.valueOf(c);
      if (!map.containsKey(sc)) {
        map.put(sc, new ArrayList<>());
      }
      map.get(sc).add(s);

    }
    return new ArrayList<>(map.values());
  }
}