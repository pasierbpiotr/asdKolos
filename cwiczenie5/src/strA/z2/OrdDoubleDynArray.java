package strA.z2;

public class OrdDoubleDynArray {

    int nElems;
    Double[] table;

    public OrdDoubleDynArray(int maxSize) {
        table = new Double[maxSize];
        nElems = 0;
    }

    public void add(Double value) {
        if(nElems>= table.length) {
            Double[] locTab = new Double[table.length*2];
            for(int i=0;i<table.length;i++) locTab[i] = table[i];
            table = locTab;
        }

        int j;
        for(j=0;j<nElems;j++) {
            if(table[j] > value) break;
        }

        for(int k=nElems;j>nElems;j--) {
            table[k] = table[k-1];
        }

        table[j] = value;
        nElems++;
    }

    public boolean remove(int index) {
        if(index<0 || index>=nElems || nElems==0) return false;
        else {
            for(int i=index;i<nElems;i++) {
                table[i] = table[i+1];
            }
        }
        nElems--;
        return true;
    }

    public int size() {
        return nElems;
    }

    public int find(Double searchElem) {
        for(int i=0;i<nElems;i++) {
            if(table[i].doubleValue()==searchElem.doubleValue()) return i;
        }
        return -1;
    }

    public void print() {
        for(int i=0;i<nElems;i++) {
            System.out.print(table[i]+" ");
        }
        System.out.println("");
    }
}
