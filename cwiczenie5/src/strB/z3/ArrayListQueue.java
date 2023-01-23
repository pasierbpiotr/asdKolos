package strB.z3;

import java.util.ArrayList;

public class ArrayListQueue {

    ArrayList<Integer> intQueue;

    public ArrayListQueue() {
        intQueue = new ArrayList<Integer>();
    }

    public void insert(Integer elem) {
        intQueue.add(elem);
    }

    public Integer remove() {
        return intQueue.remove(intQueue.size()-1);
    }

    public Integer find() {
        return intQueue.get(intQueue.size()-1);
    }

    public boolean isEmpty() {
        return intQueue.isEmpty();
    }

    public int size() {
        return intQueue.size();
    }
}
