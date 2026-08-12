class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        // might not be the most optimal solution but currently learning cyclic sort I hope it helps:)
    while(i<arr.length){
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,correct,i);
        }else{
            i++;
        }
    }
    List<Integer> ans = new ArrayList<>();
    for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j+1){
            ans.add(j+1);
        }
    }
    return ans;
        

    }
     void swap(int[] arr,int a,int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
    
}