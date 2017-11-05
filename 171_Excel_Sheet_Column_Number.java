class Solution {
    public int titleToNumber(String s) {
        int ans=0;
        int ju=0;
        for(int i=0;i<s.length();i++){
            int temp = s.charAt(i)-'A'+1;
            if(ju==0)
                ju=1;
            else
                ans *= 26;
            ans += temp;
        }
        return ans;
    }
}
