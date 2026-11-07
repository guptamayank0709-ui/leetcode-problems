class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int need = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                need += 2;

                if (need % 2 == 1) {
                    ans++;
                    need--;
                }
            } else {
                need--;

                if (need < 0) {
                    ans++;
                    need = 1;
                }
            }
        }

        return ans + need;
    }
}
        // for(int i = 0;i<ch.length-1;i++){
    //         if(ch[i]=='('){
    //             open++;

    //         }else if(ch[i]==')'&&ch[i+1]==')'&&open>0){
    //             open--;

    //         }else{
    //             closed++;
    //             need++;
    //         }

    //     }
    //   return need;