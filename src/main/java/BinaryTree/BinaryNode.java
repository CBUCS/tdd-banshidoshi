package BinaryTree;


public class BinaryNode<T> {

    public T value;
    public BinaryNode<T> rightValue;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setRightValue(BinaryNode<T> rightValue) {
        this.rightValue = rightValue;
    }

    public BinaryNode<T> getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(BinaryNode<T> leftValue) {
        this.leftValue = leftValue;
    }

    public BinaryNode<T> leftValue;

    public BinaryNode(T newValue) {
        this.value = newValue;
        this.rightValue = null;
        this.leftValue = null;
    }

    public BinaryNode<T> getRightValue() {
        return this.rightValue;
    }
}