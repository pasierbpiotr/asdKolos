package strB.z6;

import java.util.LinkedList;

public class LinkedListList {

    LinkedList<Integer> oList;

    public LinkedListList() {
        oList = new LinkedList<Integer>();
    }

    public boolean isEmpty() {
        return oList.isEmpty();
    }

    public void insertFirst(Integer elem) {
        oList.addFirst(elem);
    }

    public void insertLast(Integer elem) {
        oList.addLast(elem);
    }

    public Integer deleteFirst() {
        return oList.removeFirst();
    }

    public Integer deleteLast() {
        return oList.removeLast();
    }

    public Integer getLast() {
        return oList.peekLast();
    }

    public Integer getFirst() {
        return oList.peekFirst();
    }

    public int size() {
        return oList.size();
    }

    public void print() {
        for(int i=0;i<oList.size();i++) System.out.print(oList.get(i)+" ");
        System.out.println("");
    }
}
