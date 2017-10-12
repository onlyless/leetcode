class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int len = strs.size();
        string ans="";
        if(len==0)return ans;
        if(len==1)return strs[0];
        int minindex = 0;
        for(int i=1;i<len;i++){
            if(strs[i].size()<strs[minindex].size()){
                minindex=i;
            }
        }
        int minsize = strs[minindex].size();
        for(int i=minsize;i>=0;i--){
            ans = string(strs[minindex].begin(),strs[minindex].begin()+i);
            int j=0;
            for(;j<len;j++){
                if(j==minindex)continue;
                string temp(strs[j].begin(),strs[j].begin()+i);
                if(temp!=ans)
                    break;
            }
            if(len==j)
                return ans;
        }
        return ans;
    }
};
