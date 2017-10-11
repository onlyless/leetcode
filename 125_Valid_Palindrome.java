class Solution {
    public boolean isPalindrome(String s) {
        string temp;
        for(int i=0;i<s.size();i++){
            if((s[i]>='a'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z')||(s[i]>='0'&&s[i]<='9'))
                temp+=s[i];
        }
        int len=temp.size()-1;
        for(int i=0;i<=len/2;i++){
            char t1=temp[i]+32;
            char t2=temp[i]-32;
            if(temp[i]!=temp[len-i]&&(((temp[i]>='0'&&temp[i]<='9'&&temp[len-i]>'9')||(temp[len-i]>='0'&&temp[len-i]<='9'&&temp[i]>'9'))||(t1!=temp[len-i]&&t2!=temp[len-i])))
                return false;
        }
        return true
    }
}
