class Solution {
public:
    bool checkRecord(string s) {
        int x=0,y=0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='A')x++;
            if(s[i]=='L')y++;
            else y=0;
            if(x>=2||y>2)return false;
        }
        return true;
    }
};