class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=0;
        int n1=x;
        while(x!=0){
            int rem=x%10;
            num=rem+num;
            x=x/10;
        }
        if(n1%num==0){
          return num;
        }
        return -1;
    }
}