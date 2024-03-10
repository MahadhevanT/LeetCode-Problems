class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        for(int i:nums1){
            mp.put(i,1);
        }
        for(int j:nums2){
            if(mp.containsKey(j) && mp.get(j)==1){
                li.add(j);
                mp.put(j,0);
            }
            }
            int[] res=new int[li.size()];
            for(int i=0;i<res.length;i++){
                res[i]=li.get(i);
        }
            return res;
    }
}