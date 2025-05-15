package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0;

    @Override
    public boolean add(int value) {
        boolean added = super.add(value);
        if (added) {
            totalAdded++;
        }
        return added;
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean changed = false;
        for (int i = 0; i < list.size(); i++) {
            if (add(list.get(i))) {
                changed = true;
            }
        }
        return changed; 
    }
    
  public int getTotalAdded() {
    return totalAdded;
}

}
