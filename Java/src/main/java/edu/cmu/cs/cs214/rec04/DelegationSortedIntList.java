package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {
    private SortedIntList list = new SortedIntList();
    private int totalAdded = 0;

    @Override
    public boolean add(int value) {
        boolean added = list.add(value);
        if (added) totalAdded++;
        return added;
    }

    @Override
    public boolean addAll(IntegerList other) {
        boolean changed = false;
        for (int i = 0; i < other.size(); i++) {
            if (add(other.get(i))) {
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList other) {
        return list.removeAll(other);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public int getTotalAdded() {
        return totalAdded;
    }
}
