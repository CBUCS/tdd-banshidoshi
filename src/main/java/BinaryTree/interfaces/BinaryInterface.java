package BinaryTree.interfaces;

public interface BinaryInterface<T> {

    public boolean add(T item);
    public boolean remove(T item);
    public boolean contains(T item);
    public int numItems();
}
