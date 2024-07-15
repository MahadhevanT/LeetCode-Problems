class Solution {
    public boolean isSameAfterReversals(int num) {
        int nn=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        String str1=Integer.toString(sum);
        String str2=Integer.toString(nn);
        int l1=str1.length();
        int l2=str2.length();
        if(l1==l2){
            return true;
        }
        return false;
    }
}