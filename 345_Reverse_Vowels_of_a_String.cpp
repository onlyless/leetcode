class Solution {
public:
    string reverseVowels(string s) {
        int len = s.size();
        int i=0,j=len-1;
        while(i<j){
            i = s.find_first_of("aeiouAEIOU",i);
            j=s.find_last_of("aeiouAEIOU",j);
            if(i<j)
                swap(s[i++],s[j--]);
        }
        return s;
    }
};  