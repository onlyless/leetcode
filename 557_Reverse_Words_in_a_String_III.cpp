class Solution {
public:
    string reverseWords(string s) {
        int temp=0;
        for(int i=0;i<s.length()+1;++i){
            if(s[i]==' '||s[i]=='\0'){
                reverse(s.begin()+temp,s.begin()+i);
                temp=i+1;
            }
        }
        return s;
    }
};
