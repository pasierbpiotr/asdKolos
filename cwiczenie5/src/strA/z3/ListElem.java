package strA.z3;

public class ListElem {

    int iData;
    ListElem next;

    public ListElem(int iData) {
        this.iData = iData;
        next = null;
    }

    public String toString() {
        return Integer.toString(iData);
    }
}
