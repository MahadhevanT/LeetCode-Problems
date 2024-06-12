class Solution {
    public int[] plusOne(int[] digits) {
    int n=digits.length-1;
    while(digits[n]==9){
        if(n==0){
            int []res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        digits[n]=0;
        n-=1;
    }
    digits[n]+=1;
    return digits;
    }
}