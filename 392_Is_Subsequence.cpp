class Solution {
public:
    bool isSubsequence(string s, string t) {
        int len = s.size();
		
        for(int i=0;i<len;i++){
            auto temp = t.find(s[i]);
            if(temp==-1){
                return false;
            }else{
                t.erase(t.begin(),t.begin()+temp+1);
            }
        }
        return true;
    }
};
