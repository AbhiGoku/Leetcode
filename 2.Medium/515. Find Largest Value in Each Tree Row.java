
/**
 * Definition for a binary tree node.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// import javax.swing.tree.TreeNode;

class Solution {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public List<Integer> largestValues(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }

    if (root.left == null && root.right == null) {
      res.add(root.val);
      return res;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    int max = Integer.MIN_VALUE;
    queue.add(root);
    queue.add(null);
    while (!queue.isEmpty()) {
      TreeNode cur = queue.poll();
      if (cur == null) {
        if (queue.isEmpty()) {
          res.add(max);
          break;
        } else {
          queue.add(null);
          res.add(max);
          max = Integer.MIN_VALUE;
          continue;
        }
      } else {
        max = Math.max(max, cur.val);
        if (cur.left != null) {
          queue.add(cur.left);
        }
        if (cur.right != null) {
          queue.add(cur.right);
        }
      }
    }
    return res;
  }
}