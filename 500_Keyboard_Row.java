class Solution {
    private int judge(char a){
         if(a=='q'||a=='w'||a=='e'||a=='r'||a=='t'||a=='y'||a=='u'||a=='i'||a=='o'||a=='p'||a=='Q'||a=='W'||a=='E'||a=='R'||a=='T'||a=='Y'||a=='U'||a=='I'||a=='O'||a=='P')
            return 1;
        else if(a=='a'||a=='s'||a=='d'||a=='f'||a=='g'||a=='h'||a=='j'||a=='k'||a=='l'||a=='A'||a=='S'||a=='D'||a=='F'||a=='G'||a=='H'||a=='J'||a=='K'||a=='L')
            return 2;
        else  if(a=='z'||a=='x'||a=='c'||a=='v'||a=='b'||a=='n'||a=='m'||a=='Z'||a=='X'||a=='C'||a=='V'||a=='B'||a=='N'||a=='M')
            return 3;
        return 0;
    }
    public String[] findWords(String[] words) {
        List<String> strs = new ArrayList<>();
        int len = words.length;
        for(String s:words){
            int ju=0;
            boolean he = true;
            switch(judge(s.charAt(0))){
                case 1:ju=1;break;
                case 2:ju=2;break;
                case 3:ju=3;break;
                default:break;
            }
            for(int i=1;i<s.length();i++){
                if(ju==1){
                    if(judge(s.charAt(i))!=1){
                        he=false;
                        break;
                    }
                }else if(ju==2){
                    if(judge(s.charAt(i))!=2){
                        he=false;
                        break;
                    }
                }else if(ju==3){
                    if(judge(s.charAt(i))!=3){
                        he=false;
                        break;
                    }
                }
            }
            if(he)
                strs.add(s);
        }
        return strs.toArray(new String[0]);
    }
}
