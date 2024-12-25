class Solution {
  public double findMaxAverage(int[] nums, int k) {
      if(nums.length==1){
          return nums[0];
      }
      int sum=0;
      double res=0;
      
      for(int i=0;i<k;i++){
          sum+=nums[i];
      }

      res=(double)sum/k;
      
      for(int i=k;i<nums.length;i++){
          sum-=nums[i-k];
          sum+=nums[i];
          res=Math.max(res,(double)sum/k);

      }
      return res;


  }
}