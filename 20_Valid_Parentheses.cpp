#include<stack>
class Solution {
public:
    bool isValid(string s) {
        stack<char> sch;
        for(int i=0;i<s.size();i++){
            switch(s[i]){
                case '(':
                case '{':
                case '[':sch.push(s[i]);break;
                case ']':if(sch.empty()||sch.top()!='[')return false;else sch.pop();break;
                case ')':if(sch.empty()||sch.top()!='(')return false;else sch.pop();break;
                case '}':if(sch.empty()||sch.top()!='{')return false;else sch.pop();break;
                default:break;
            }
        }
        return sch.empty();
    }
};