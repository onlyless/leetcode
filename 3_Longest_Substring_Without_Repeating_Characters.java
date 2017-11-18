class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)
            return 1;
        Set<Character> set = new HashSet<>();
        int max = 0,j=0,i=0;
        while(i<s.length()){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(j++));
            }
            else{
                set.add(s.charAt(i++));
                max = Math.max(max,set.size());
            }
        }
        return max;
    }
}