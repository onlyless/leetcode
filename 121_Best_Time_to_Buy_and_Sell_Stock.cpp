class Solution {
public:
    int maxProfit(vector<int>& prices) {
        if(prices.size()==0||prices.size()==1)return 0;
        int ans=0;
        for(int i=0;i<prices.size()-1;i++){
            for(int j=i+1;j<prices.size();j++){
                if(ans<prices[j]-prices[i])
                    ans=prices[j]-prices[i];
            }
        }
        return ans;
    }
};