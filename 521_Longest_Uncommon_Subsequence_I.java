public class Solution {
    public int findLUSlength(String a, String b) {
        if(a.compareTo(b)==0)
            return -1;
        else return Math.max(a.length(),b.length());
    }
}
