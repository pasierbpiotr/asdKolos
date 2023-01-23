package strB.z1;

import java.util.ArrayList;

public class ArrayListStack {

    ArrayList<Integer> intStack;

    public ArrayListStack() {
        intStack = new ArrayList<Integer>();
    }

    public void push(Integer value) {
        intStack.add(value);
    }

    public Integer peek() {
        return intStack.get(intStack.size()-1);
    }

    public Integer pop() {
        return intStack.remove(intStack.size()-1);
    }

    public boolean isEmpty() {
        return intStack.isEmpty();
    }
}
