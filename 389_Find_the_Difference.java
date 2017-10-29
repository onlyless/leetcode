class Solution {
    public char findTheDifference(String s, String t) {
        int codechar = t.charAt(s.length());
        for(int i=0;i<s.length();i++){
            codechar -= s.charAt(i);
            codechar += t.charAt(i);
        }
        return (char)codechar;
    }
}
