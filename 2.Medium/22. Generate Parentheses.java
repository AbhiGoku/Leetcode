import java.util.*;

class Solution {
  public List<String> generateParenthesis(int n) {
      List<String> output=new ArrayList<>();
      backtracking(output,n,"",0,0);
      return output;
  }

  private void backtracking(List<String> output,int max,String result,int open,int close){
      if(result.length()==max*2){
          output.add(result);
          return;
      }
      if(open<max)backtracking(output,max,result+"(",open+1,close);
      if(close<open)backtracking(output,max,result+")",open,close+1);
  }
}