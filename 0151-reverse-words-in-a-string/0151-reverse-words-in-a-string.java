class Solution {
    public String reverseWords(String s) {
       s = s.trim().replaceAll("\\s+", " ");
        String ans = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            ans += arr[arr.length-1-i]+" ";
        }
        ans = ans.strip();
        return ans;   
    }
}