class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        String[] ans = new String[words.length];

        for (String word : words) {

            int n = word.length();

            int position = word.charAt(n - 1) - '0';

            String actualWord = word.substring(0, n - 1);

            ans[position - 1] = actualWord;
        }

        return String.join(" ", ans); 
    }
}