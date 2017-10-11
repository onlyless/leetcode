class Solution {
public:
    struct node{
        int x,y;
        node(int _x,int _y):x(_x),y(_y){}
    };
    bool judgeCircle(string moves) {
        node N(0,0);
        for(int i=0;i<moves.length();i++){
            switch(moves[i]){
                case 'U':N.y++;break;
                case 'L':N.x--;break;
                case 'D':N.y--;break;
                case 'R':N.x++;break;
                default: break;
            }
        }
        if(N.x==0&&N.y==0)
            return true;
        else return false;
    }
};
