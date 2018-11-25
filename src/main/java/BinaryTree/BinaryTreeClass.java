package BinaryTree;

import BinaryTree.interfaces.BinaryInterface;

public class BinaryTreeClass<T> implements BinaryInterface<T> {
    private BinaryNode<T> root;


    public boolean accept(Visitors v){
        if(this.root==null) {
            return false;
        }
        else {
            v.visit(this.root);
            return true;
        }
    }

    public boolean add(T pItem) {
        this.root = insertion(this.root,pItem);
        return true;
    }

    public boolean remove(T pItem) {
        if(contains(pItem)) {
            deleteNode(this.root, pItem);
            return true;
        }
        else
            return false;
    }

    public boolean contains(T pItem) {
        return searchTree(this.root,pItem);
    }

    public int numItems() {
        return count(this.root);
    }

    private boolean searchTree (BinaryNode<T> currentNode, T pItem){
        if(currentNode==null)
            return false;
        else if(currentNode.getValue()==pItem)
            return true;
        else{
            if((Integer)currentNode.getValue()>(Integer) pItem)
                return searchTree(currentNode.getLeftValue(),pItem);
            else
                return searchTree(currentNode.getRightValue(),pItem);
        }
    }


    private BinaryNode<T> deleteNode (BinaryNode<T> currentNode, T pItem){
        if(currentNode==null)
            return null;
        if(currentNode.getValue()==pItem){
            if(currentNode.getLeftValue()==null&&currentNode.getRightValue()==null)
                return null;
            if(currentNode.getRightValue()==null)
                return currentNode.getLeftValue();
            if(currentNode.getLeftValue()==null)
                return currentNode.getRightValue();
            
            T smallestItem = findSmall(currentNode.getRightValue());
            currentNode.setValue(smallestItem);
            currentNode.setRightValue(deleteNode(currentNode.getRightValue(),smallestItem));
            return currentNode;
        } else if((Integer)currentNode.getValue()>(Integer)pItem)
            currentNode.setLeftValue(deleteNode(currentNode.getLeftValue(),pItem));
        else if ((Integer)currentNode.getValue() < (Integer)pItem)
            currentNode.setRightValue(deleteNode(currentNode.getRightValue(),pItem));
        return currentNode;
    }

    private int count (BinaryNode<T> pCurrent) {
        if(pCurrent==null)
            return 0;
        else{
            int count = 1;
            count += count(pCurrent.getLeftValue());
            count += count(pCurrent.getRightValue());
            return count;
        }
    }

    private BinaryNode<T> insertion (BinaryNode<T> currentNode, T pItem){
        if(currentNode==null)
            return new BinaryNode<T>(pItem);
        else if((Integer)currentNode.getValue()>(Integer) pItem)
            currentNode.setLeftValue(insertion(currentNode.getLeftValue(),pItem));
        else if ((Integer)currentNode.getValue()<(Integer) pItem)
            currentNode.setRightValue(insertion(currentNode.getRightValue(),pItem));
        return currentNode;
    }

    private T findSmall(BinaryNode<T> Node){
        if(Node.getLeftValue()==null)
            return Node.getValue();
        else
            return findSmall(Node.getLeftValue());
    }
}
