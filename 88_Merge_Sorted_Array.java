class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return ;
        if(m==0){
            for(int i=0;i<n;i++)
                nums1[i] = nums2[i];
            return ;
        }
        int len = m+n;
        int []te = new int[m];
        for(int i=0;i<m;i++){
            te[i] = nums1[i];
        }
        int i=0,j=0;
        for(int a=0;a<len;a++){
            if(i==m){
                nums1[a] = nums2[j++];
                continue;
            }
            if(j==n){
                nums1[a] = te[i++];
                continue;
            }
            if(te[i]<nums2[j]){
                nums1[a] = te[i++];
            }else
                nums1[a] = nums2[j++];
        }
       
    }
}