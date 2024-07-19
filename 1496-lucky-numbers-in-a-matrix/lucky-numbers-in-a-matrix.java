class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res= new ArrayList();
        int[] rows=new int[matrix.length],
              cols=new int[matrix[0].length];
        Arrays.fill(rows,Integer.MAX_VALUE);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                rows[i]=Math.min(rows[i],matrix[i][j]);
                cols[j]=Math.max(cols[j],matrix[i][j]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows[i]==cols[j]){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    }
}