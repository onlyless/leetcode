class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
                j++;
            }
        }
        int[] res = new int[list.size()];
        int k=0;
        for(int i:list)
            res[k++] = i;
        return res;
    }
}
