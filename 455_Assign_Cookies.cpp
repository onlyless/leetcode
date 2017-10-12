class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        int ans=0;
        int index=0;
        for(int i=0;i<s.size();i++){
            if(g[index]<=s[i]){
                ans++;
                index++;
            }
            if(index>=g.size())break;
        }
        return ans;
    }
};