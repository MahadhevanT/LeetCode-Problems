class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int l=j-i;
            int res=h*l;
            if(res>max){
                max=res;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}