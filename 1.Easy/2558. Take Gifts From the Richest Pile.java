import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
  public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    long res = 0;
    for (int i : gifts) {
      queue.add(i);
    }
    while (k > 0) {
      k--;
      int a = queue.poll();
      a = (int) Math.sqrt(a);
      queue.add((int) a);
      // res+=a;
    }
    while (!queue.isEmpty()) {
      res += queue.poll();
    }
    return res;
  }
}