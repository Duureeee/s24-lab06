package edu.cmu.cs.cs214.rec04;

public interface IntegerList {
    boolean add(int num);
    boolean addAll(IntegerList list);
    int get(int index);
    boolean remove(int num);
    boolean removeAll(IntegerList list);
    int size();

    // ✅ зөв төрөлтэй метод
    int getTotalAdded();
}
