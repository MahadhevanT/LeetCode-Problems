class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     int[][]newI=Arrays.copyOf(intervals,intervals.length+1);
     newI[newI.length-1]=newInterval;
     return merge(newI);   
    }
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> li=new LinkedList<>();
        for(int[] interval:intervals){
            if(li.isEmpty() || li.getLast()[1] < interval[0]){
                li.add(interval);
            }else{
                li.getLast()[1]=Math.max(li.getLast()[1],interval[1]);
            }
        }
        return li.toArray(new int[li.size()][]);
    }
}