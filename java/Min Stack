import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> values = new ArrayList<Integer>();
    ArrayList<Integer> minStack = new ArrayList<Integer>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        values.add(val);
        if (minStack.size()==0||val<=minStack.get(minStack.size()-1)){
            minStack.add(val);
        }
    }
    
    public void pop() {
        if (values.get(values.size()-1).equals(minStack.get(minStack.size()-1))){
            minStack.remove(minStack.size()-1);
        }
        values.remove(values.size()-1);
    }
    
    public int top() {
        return values.get(values.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
