import java.util.*;

class UnderFlowException extends Exception {
    public UnderFlowException(String str) {
        super(str);
    }
}

class Stack1 {

    private Vector<Object> v = new Vector<>();

    public Stack1() {}

    public void push1(Object o) {
        v.add(o);
    }

    public Object pop1() throws UnderFlowException {
        if (empty1()) {
            throw new UnderFlowException("Stack is empty");
        } else {
            Object o = v.lastElement();
           
            v.remove(v.size() - 1);
            return o;
        }
    }

    public boolean empty1() {
        return v.isEmpty(); // Fix: Use isEmpty() instead of size()<1
    }
}