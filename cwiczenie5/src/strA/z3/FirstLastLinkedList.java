package strA.z3;

public class FirstLastLinkedList {

    ListElem first;
    ListElem last;
    public FirstLastLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void addFirst(int value) {
        ListElem newElem = new ListElem(value);
        if(isEmpty()) last = newElem;
        newElem.next = first;
        first = newElem;
    }

    public void addLast(int value) {
        ListElem newElem = new ListElem(value);
        if(isEmpty()) first = newElem;
        newElem.next = last;
        last = newElem;
    }

    public ListElem deleteFirst() {
        if(isEmpty()) return null;
        ListElem temp = first;
        if(first.next==null) last = null;
        first = first.next;
        return temp;
    }

    public void print() {
        ListElem current = first;
        while(current != null) {
            System.out.print(current+" ");
            current = current.next;
        }
        System.out.println("");
    }
}
