class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int ju = 0;
        for(int i=0;i<nums1.length;i++){
            hh:
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int temp = j++;
                    while(temp<nums2.length){
                        if(nums2[temp]>nums1[i]){
                            res[ju++]=nums2[temp];
                            break hh;
                        }
                        temp++;
                    }
                    res[ju++] = -1;
                }
            }
        }
        return res;
    }
}

//sample 3 ms submission
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length == 0) return new int[]{};
        int[] res = new int[nums1.length];
        int max = Integer.MIN_VALUE;
        for(int num : nums2){
            if(max < num) max = num;
        }
        int[] map = new int[max + 1];
        Arrays.fill(map, -1);
        for(int i = 0 ; i < nums2.length ; i ++){
            map[nums2[i]] = i;
        }
        for(int i = 0 ; i < nums1.length ; i ++){
            if(nums1[i] >= max) res[i] = -1;
            else{
                int index = map[nums1[i]];
                while(++index < nums2.length){
                    if(nums2[index] > nums1[i]){
                        res[i] = nums2[index];
                        break;
                    }
                }
                if(res[i] == 0) res[i] = -1;
            }
        }
        return res;
    }
}