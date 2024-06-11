class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    int tar=0;
    Arrays.sort(nums);
    int n=nums.length;
    Set<List<Integer>> set=new HashSet<>();
    List<List<Integer>> li=new ArrayList<>();
    for(int i=0;i<n;i++){
        int j=i+1;
        int k=n-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==tar){
                set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }else if(sum<tar){
                j++;
            }else{
                k--;
            }
        }
    }
    li.addAll(set);
    return li;
    }
}