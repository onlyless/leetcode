public class Solution {
    public int romanToInt(String s) {
        int[] sums = new int[s.length()];
        int val=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':sums[i]=1;break;
                case 'V':sums[i]=5;break;
                case 'X':sums[i]=10;break;
                case 'L':sums[i]=50;break;
                case 'C':sums[i]=100;break;
                case 'D':sums[i]=500;break;
                case 'M':sums[i]=1000;break;
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(sums[i]>=sums[i+1])
                val += sums[i];
            else
                val -=sums[i];
        }
        return val+sums[s.length()-1];
    }
}