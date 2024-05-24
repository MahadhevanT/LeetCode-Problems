class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int a=matrix.length;
        int b=matrix[0].length;
        int[] max=new int[b];
        Arrays.fill(max,Integer.MIN_VALUE);
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                max[i]=Math.max(max[i],matrix[j][i]);
            }
        }
        int[][] res=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                res[i][j]=matrix[i][j];
            }
        }
        for(int j=0;j<b;j++){
            for(int i=0;i<a;i++){
                if(res[i][j]==-1){
                    res[i][j]=max[j];
                }
            }
        }
                                  return res;
}
}