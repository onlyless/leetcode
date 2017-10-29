class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                if(k==0&&!set.contains(nums[i])){
                    ans++;
                    set.add(nums[i]);
                }
                i++;
            }
            int val = nums[i]+k;
            for(int j=i+1;j<nums.length;j++){
                if(val==nums[j]){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
