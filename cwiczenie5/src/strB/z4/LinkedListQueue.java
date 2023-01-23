package strB.z4;

import java.util.LinkedList;

public class LinkedListQueue {

    LinkedList<Integer> intQueue;

    public LinkedListQueue() {
        intQueue = new LinkedList<Integer>();
    }

    public void insert(Integer elem) {
        intQueue.addLast(elem);
    }

    public Integer remove() {
        return intQueue.removeFirst();
    }

    public Integer find() {
        return intQueue.peekFirst();
    }

    public boolean isEmpty() {
        return intQueue.isEmpty();
    }

    public int size() {
        return intQueue.size();
    }
}
