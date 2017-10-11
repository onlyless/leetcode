class Solution {
public:
    bool ju1(string word){
        if(word[0]<='Z'&&word[0]>='A'){
            for(int i=1;i<word.size();i++){
                if(word[i]<'a'||word[i]>'z')
                    return false;
            }
            return true;
        }
        else {
            for(int i=0;i<word.size();i++){
                if(word[i]<'a'||word[i]>'z')
                    return false;
            }
            return true;
        }
    }
    bool ju2(string word){
        for(int i=0;i<word.size();i++){
            if(word[i]<'A'||word[i]>'Z')
                return false;
        }
        return true;
    }
    bool detectCapitalUse(string word) {
        if(ju1(word))
            return true;
        if(ju2(word))
            return true;
        return false;
    }
};
