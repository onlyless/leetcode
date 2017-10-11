class Solution {
    public int distributeCandies(int[] candies) {
        int len = 200010;
        int[] N = new int[len];
        for(int i=0;i<candies.length;i++)
            N[candies[i]+100000]++;
        int max =0;
        for(int i=0;i<len;i++)
            if(N[i]!=0)
                max++;
        if(max<=candies.length/2){
            return max;
        }else
            return candies.length/2;
    }
}
