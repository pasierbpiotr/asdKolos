package strA.z4;

public class SortedLinkedList {

    ListElem first;

    public SortedLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(int value) {
        ListElem newElem = new ListElem(value);
        newElem.next = first;
        first = newElem;
    }

    public void insert(int value) {
        ListElem newElem = new ListElem(value);
        ListElem previous = null;
        ListElem current = first;
        while(current != null && current.iData < newElem.iData) {
            previous = current;
            current = current.next;
        }

        if(previous==null) first = newElem;
        else previous.next = newElem;
        newElem.next = current;
    }

    public ListElem find(int elem) {
        if(isEmpty()) return null;
        ListElem current = first;

        while(current.iData != elem) {
            if(current.next==null) return null;
            else current = current.next;
        }

        return current;
    }

    public ListElem deleteFirst() {
        if(isEmpty()) return null;

        ListElem temp = first;
        first = first.next;
        return temp;
    }

    public ListElem delete(int elem) {
        if(isEmpty()) return null;

        ListElem current = first;
        ListElem previous = null;
        while(current.iData != elem) {
            if(current == null) return null;
            else {
                previous = current;
                current = current.next;
            }
        }

        if(previous == null) first = first.next;
        else previous.next = current.next;

        return current;
    }

    public void print() {
        ListElem current = first;
        while(current != null) {
            System.out.print(current.toString()+" ");
            current = current.next;
        }
    }
}
