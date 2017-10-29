class Solution {
    public int getSum(int a, int b) {
        if(b==0) return a;
        if(a==0) return b;
        while( b != 0){
            int temp = a&b;
            a = a ^ b;
            b = temp << 1;
        }
        return a;
    }
}
