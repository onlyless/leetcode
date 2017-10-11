class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int line = nums.length;
        int row = nums[0].length;
        if(line*row!=r*c)
            return nums;
        int[][] ans = new int[r][c];
        int temp1 = 0;
        int temp2 = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j] = nums[temp1][temp2++];
                if(temp2%row==0&&temp2!=0){
                    temp2=0;
                    temp1++;
                }
            }
        }
        return ans;
    }
}
