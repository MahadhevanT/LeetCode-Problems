class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       Set<Integer> set=new HashSet<>();
       int res=-1;
       for(int n:nums1){
           set.add(n);
       } 
       for(int n:nums2){
           if(set.contains(n)){
               res=n;
               break;
           }
       }
       return res;
    }
}