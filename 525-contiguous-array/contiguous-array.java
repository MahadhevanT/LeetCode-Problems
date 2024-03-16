class Solution {
    public int findMaxLength(int[] nums) {
         Map<Integer,Integer> mp=new HashMap<>();
         mp.put(0,-1);
         int s=0,max=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                s--;
            }else{
                s++;
            }
            if(mp.containsKey(s)){
                max=Math.max(max,i-mp.get(s));
            }else{
                mp.put(s,i);
            }
    }
    return max;
    }
}