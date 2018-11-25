package BinaryTree;

import BinaryTree.BFS;
import BinaryTree.BinaryTreeClass;
import BinaryTree.DFS;
import BinaryTree.Visitors;

public class MainBinary {

    public static void main(String... args){

        BinaryTreeClass<Integer> tree = new BinaryTreeClass<Integer>();
        tree.add(6);
        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(5);
        tree.add(2);

        Visitors BFS = new BFS();
        Visitors DFS = new DFS();

        tree.accept(BFS);
        tree.accept(DFS);
    }
}
