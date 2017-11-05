class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int l =(int) Math.sqrt(area);
        for(int i=l;i>0;i--){
            if(area%i==0){
                res[1] = i;
                res[0] = area/i;
                break;
            }
        }
        return res;
    }
}
