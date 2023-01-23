package strB.z2;

import java.util.LinkedList;

public class LinkedListStack {

    LinkedList<Integer> intStack;

    public LinkedListStack() {
        intStack = new LinkedList<Integer>();
    }

    public void push(Integer elem) {
        intStack.push(elem);
    }

    public Integer pop() {
        return intStack.pop();
    }

    public Integer peek() {
        return intStack.peek();
    }

    public boolean isEmpty() {
        return intStack.isEmpty();
    }
}
