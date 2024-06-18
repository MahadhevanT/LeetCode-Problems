class Solution {
    public int differenceOfSum(int[] nums) {
    int n=nums.length;
    int sum1=0;
    int sum2=0;
    for(int i=0;i<n;i++){
        sum1+=nums[i];
    }
    for(int i=0;i<n;i++){
            int rem,dd=0;
        if(nums[i]>9){
            int a=nums[i];
            while(a>0){
                rem=a%10;
                dd+=rem;
               // System.out.println(dd);
                a=a/10;
                //System.out.println(a);
            }
            sum2+=dd;
        }else{
            sum2+=nums[i];
        }
    }  
    return sum1-sum2;
    }
    
}