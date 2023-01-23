package strB.z8;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSet {

    TreeSet<Integer> treeSet;

    public TreeSetSet() {
        treeSet = new TreeSet<Integer>();
    }

    public TreeSet getTreeSet() {
        return treeSet;
    }

    public int size() {
        return treeSet.size();
    }

    public boolean member(Integer elem) {
        return treeSet.contains(elem);
    }

    public void insert(Integer elem) {
        if(!member(elem)) {
            treeSet.add(elem);
        }
    }

    public boolean delete(Integer elem) {
        if(member(elem)) {
            treeSet.remove(elem);
            return true;
        }
        else return false;
    }

    public TreeSetSet union(TreeSetSet secondSet) {
        TreeSetSet unionSet = new TreeSetSet();
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            int locElem = iterator.next().intValue();
            unionSet.insert(locElem);
        }

        Iterator<Integer> iteratorS = secondSet.getTreeSet().iterator();
        while(iteratorS.hasNext()) {
            int locElem = iteratorS.next().intValue();
            unionSet.insert(locElem);
        }

        return unionSet;
    }

    public TreeSetSet intersection(TreeSetSet secondSet) {
        TreeSetSet intersectionSet = new TreeSetSet();
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            int locElem = iterator.next().intValue();
            if(secondSet.member(locElem)) intersectionSet.insert(locElem);
        }

        return intersectionSet;
    }

    public TreeSetSet difference(TreeSetSet secondSet) {
        TreeSetSet differenceSet = new TreeSetSet();
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            int locElem = iterator.next().intValue();
            if(!secondSet.member(locElem)) differenceSet.insert(locElem);
        }

        return differenceSet;
    }
}
