package strA.z1;

public class DoubleDynArray {

    Double[] table;
    int nElems;

    public DoubleDynArray(int maxSize) {
        table = new Double[maxSize];
        nElems = 0;
    }

    public void add(Double value) {
        if(nElems>= table.length) {
            Double[] locTab = new Double[table.length*2];
            for(int i=0;i<nElems;i++) locTab[i] = table[i];
            table = locTab;
        }

        table[nElems] = value;
        nElems++;
    }

    public boolean remove(int index) {
        if(index<0 || index>=nElems || nElems==0) return false;
        else {
            for(int i=index;i<nElems-1;i++)
                table[i] = table[i+1];
        }
        nElems--;
        return true;
    }

    public Double get(int index) {
        return table[index];
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
}
