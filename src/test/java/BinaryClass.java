import BinaryTree.BFS;
import BinaryTree.BinaryTreeClass;
import BinaryTree.DFS;
import BinaryTree.Visitors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryClass
{


    BinaryTreeClass tree;
    Visitors v;


    @Test
    public void BFS(){
        tree = new BinaryTreeClass<Integer>();
        tree.add(8);
        v = new BFS();
        Assertions.assertTrue(v.visit(tree.getRoot()));
    }

    @Test
    public void DFS(){
        tree = new BinaryTreeClass<Integer>();
        tree.add(8);

        v = new DFS();
        Assertions.assertTrue(v.visit(tree.getRoot()));
    }
}
