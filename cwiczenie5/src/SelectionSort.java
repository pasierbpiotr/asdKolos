import java.util.Random;

public class SelectionSort {

    public static int nElems = 10;
    public static int[] table = new int[nElems];
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i=0;i<nElems;i++) table[i] = rand.nextInt(200);
        SelectionSort();
    }

    public static void SelectionSort() {
        for(int i=0;i<nElems-1;i++) {
            System.out.print("i="+i+" Przed: ");
            for(int j=0;j<nElems;j++) System.out.print(table[j]+" ");
            System.out.println("");

            int minPos = i;
            for(int j=i+1;j<nElems;j++) if(table[j]<table[minPos]) minPos = j;
            int temp = table[minPos];
            table[minPos] = table[i];
            table[i] = temp;

            System.out.print("Po: ");
            for(int j=0;j<nElems;j++) System.out.print(table[j]+" ");
            System.out.println("");
        }
    }
}
