class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String w1 = "";
    String w2 = "";
    for (int j =0;j<word1.length;j++) {
       w1+=word1[j];
    }
    for (int i = 0;i<word2.length;i++) {
      w2+=word2[i];  
    } 
    if(w1.equals(w2)){
        return true;
    }
    
      return false;     
    }
}