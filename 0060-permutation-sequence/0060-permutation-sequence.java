class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> pool = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            pool.add(i);
        }

        int[] fact = new int[n+1];
        fact[0] = 1;
        for(int i =1;i<fact.length;i++){
            fact[i] = i*fact[i-1];
        }
        k = k-1;

        StringBuilder sb = new StringBuilder();
        for(int i = n;i>0;i--){
            int groupsize = fact[i-1];

            int index = k/groupsize;
            sb.append(pool.get(index));
            pool.remove(index);
            k = k%groupsize;
        }
      return  sb.toString();
    }

}
        // given solution has TC of O(n*n!)
    //    String s = "";
    //    for(int i = 1;i<=n;i++){
    //     s = s + i;
    //    }
    //    ArrayList<String> potential = permutationsList("",s);
    //     potential.sort(Comparator.comparingInt(Integer::parseInt));
       
    //     return potential.get(k-1);
    // }
    // //  ArrayList<String> permutationsList(String s){
    // //     ArrayList<ArrayList<String>> ans = new ArrayList<>();
    // //     ans.add(new ArrayList<String>());
    // //     for(int i =0;i<s.length();i++){
    // //         String p = "";
    // //         for(int j = 0;j<s.length()&&j!=i;j++){
    // //            p =  p+s.charAt(i) + s.charAt(j);
    // //             ans.addAll(p);
    // //         }
    // //     }
    // //     return ans;
    // //  }
    //  ArrayList<String> permutationsList(String p, String up) {
    //     if (up.isEmpty()) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     char ch = up.charAt(0);

    //     // local to this call
    //     ArrayList<String> ans = new ArrayList<>();

    //     for (int i = 0; i <= p.length(); i++) {
    //         String f = p.substring(0, i);
    //         String s = p.substring(i, p.length());
    //         ans.addAll(permutationsList(f + ch + s, up.substring(1)));
    //     }
    //     return ans;