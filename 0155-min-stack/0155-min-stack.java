import java.util.*;

class MinStack {
    private Stack<Long> stack = new Stack<>();
    private long min;

    public MinStack() {
       min = Long.MAX_VALUE;
    }
    
    public void push(int value) {
       
        if(stack.isEmpty()){
            stack.push((long)value);
            min = value;
        }
        else if(value<min){
           stack.push(2*(long)value-min);
            min = value;
        }else{
           stack.push((long)value);
        }
    }
        
    
    public void pop() {
    if(stack.peek()<min){
        min = 2*min - stack.peek();
    }
   stack.pop();
    }
    
    public int top() {
        if(stack.peek()<min){
            return (int)min;
        }
            return stack.peek().intValue();
        
    }
    
    public int getMin() {
       return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */