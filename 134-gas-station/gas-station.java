class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int si=0;
        int csum=0;
        int osum=0;
        for(int i=0;i<gas.length;i++){
            int ans=gas[i]-cost[i];
            csum+=ans;
            osum+=ans;
            if(csum<0){
                csum=0;
                si=i+1;
            }
        }
            if(osum>=0) return si;
        return -1;
    }
}