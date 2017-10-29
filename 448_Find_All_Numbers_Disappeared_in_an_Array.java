/*Use Set*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=len;i++){
            if(!set.contains(i))
                list.add(i);
        }
        return list;
    }
}
/*Use Arrays*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        boolean[] set = new boolean[len+1];
        for(int i:nums){
            set[i] = true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=len;i++){
            if(!set[i])
                list.add(i);
        }
        return list;
    }
}
