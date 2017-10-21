class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp=0;
        if(nums.length==1){
            max = nums[0];
        }
        else
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1)
                    temp++;
                else{
                    if(max<temp)
                        max = temp;
                    temp=0;
                }
            }
        if(max<temp)
            max = temp;
        return max;
    }
}
