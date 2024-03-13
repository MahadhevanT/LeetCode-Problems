class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return n;
        }
        int left=1;
        int right=n;
        int suml=left;
        int sumr=right;
        while(left<right){
            if(suml<sumr){
                left++;
                suml+=left;
            }
            else{
                right--;
                sumr+=right;
            }
            if(suml==sumr && left+1==right-1){
                return left+1;
            }
        }
        return -1;
    }
}