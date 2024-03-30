class Solution {
    public int removeElement(int[] nums, int val) {
      int n=nums.length;
      int[] temp=new int[n];
      int j=0;
      for(int i=0;i<n;i++){
        if(nums[i]!=val){
            temp[j++]=nums[i];
        }
      }
      for(int i=0;i<j;i++){
        nums[i]=temp[i];
      }  
      return j;
    }
}