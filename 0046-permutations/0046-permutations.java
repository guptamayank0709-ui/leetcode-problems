class Solution {
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());               // start with [[]]

        for (int num : nums) {
            List<List<Integer>> next = new ArrayList<>();

            for (List<Integer> perm : result) {
                for (int pos = 0; pos <= perm.size(); pos++) {
                    List<Integer> copy = new ArrayList<>(perm);  // copy, don't modify perm
                    copy.add(pos, num);                          // insert at position pos
                    next.add(copy);                              // add list into list
                }
            }
            result = next;
        }
        return result;   
    }
    
}