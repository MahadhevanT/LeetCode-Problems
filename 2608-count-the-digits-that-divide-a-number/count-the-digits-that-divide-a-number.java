class Solution {
    public int countDigits(int num) {
        int n=0,c=0;
        int ans=num;
        while(ans>0){
            n=ans%10;
            ans=ans/10;

            if(num%n==0){
                c++;
            }
        }
        return c;
    }
}