class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        for(int i=0;i<numbers.size();i++){
            if(numbers[i]>target)
                break;
            for(int j=i+1;j<numbers.size();j++){
                if(numbers[i]+numbers[j]>target)
                    break;
                if(numbers[i]+numbers[j]==target)
                    return {i+1,j+1};
            }
        }
    }
};