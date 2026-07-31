class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ones = 0;
        int index = 0;
        int temp = 0;
        for(int i=0;i<mat.length;i++){
            temp = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    temp++;
                }
            }
            if(ones<temp){
                ones=temp;
                index=i;
            }
        }
        return new int[]{index, ones};
    }
}