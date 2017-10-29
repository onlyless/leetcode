class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops==null||ops.length==0)
            return m*n;
        int min1 = ops[0][0],min2 = ops[0][1];
        for(int i=0;i<ops.length;i++){
            int temp1 = ops[i][0],temp2 = ops[i][1];
            if(min1>temp1)
                min1 = temp1;
            if(min2>temp2)
                min2 = temp2;
        }
        return min1*min2;
    }
}
