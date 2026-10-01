class Solution {
    public List<String> letterCombinations(String digits) {
        return addret("",digits);
    }
    List<String> addret(String p, String up) {
        if (up.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        if(digit<7&&digit>1){
        for (int i = (digit-2) * 3; i < (digit-1) * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(addret(p+ch,up.substring(1)));
        }
        }
        if(digit==7){
            for(int j = 15;j<19;j++){
            char ch = (char)('a'+j);
            ans.addAll(addret(p+ch,up.substring(1)));
        }
        }
        if(digit==8){
            for(int k=19;k<22;k++){
                 char ch = (char)('a'+k);
            ans.addAll(addret(p+ch,up.substring(1)));
            }
        }
            if(digit==9){
                for(int l =22;l<26;l++){
                     char ch = (char)('a'+l);
            ans.addAll(addret(p+ch,up.substring(1)));
                }
            }
        return ans;
}
}