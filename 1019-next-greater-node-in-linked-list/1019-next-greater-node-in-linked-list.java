/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head!=null){
            list.add(head.val);
            head = head.next;
        }

        Stack<Integer> stack = new Stack<>();

        int[] op = new int[list.size()];

        for(int i = 0;i<list.size();i++){
            while(!stack.isEmpty()&&list.get(stack.peek())<list.get(i)){
                op[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }
        return op;
    }

}
    //     int l = findlength(head);
    //     ListNode temp = head;
    //     ListNode temp2 = temp;
    //     int[] ans = new int[l];
    //     int i = 0;
    //     while(temp!=null&&temp.next!=null&&i<ans.length){
    //         if(temp2.val>=temp2.next.val){
    //             temp2 = temp2.next;

    //         }
    //         else{
    //             ans[i] = temp2.val;
    //         }
    //         temp = temp.next;
    //         i++;
    //     }
    // return ans;
    // }

    // int findlength(ListNode head){
    //     ListNode temp = head;
    //     int length = 1;

    //     while(temp!=null && temp.next!=null){
    //         length++;
    //         temp = temp.next;
    //     }

    //     return length;