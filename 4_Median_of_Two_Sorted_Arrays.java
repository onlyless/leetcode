class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length+nums2.length;
        int[] res = new int[sum];
        for(int i=0;i<nums1.length;i++){
            res[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[i+nums1.length] = nums2[i];
        }
        Arrays.sort(res);
        if(sum%2==1){
            return res[sum/2];
        }
        else
            return (res[sum/2-1]+res[sum/2])/2.0;
        
    }
}