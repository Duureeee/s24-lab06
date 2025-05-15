package edu.cmu.cs.cs214.rec04;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedIntList implements IntegerList {
    protected List<Integer> list = new ArrayList<>();

    @Override
    public boolean add(int num) {
        list.add(num);
        Collections.sort(list);
        return true;
    }

    @Override
    public boolean addAll(IntegerList other) {
        for (int i = 0; i < other.size(); i++) {
            add(other.get(i));
        }
        return true;
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove((Integer) num);
    }

    @Override
    public boolean removeAll(IntegerList other) {
        boolean changed = false;
        for (int i = 0; i < other.size(); i++) {
            if (remove(other.get(i))) {
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public int getTotalAdded() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotalAdded'");
    }
}