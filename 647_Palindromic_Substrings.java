class Solution {
    private boolean ispali(String s){
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1))
                return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int res = s.length();
        if(res==1)
            return res;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+2;j<s.length()+1;j++){
                if(ispali(s.substring(i,j))){
                    res++;
                }
            }
        }
        return res;
    }
}