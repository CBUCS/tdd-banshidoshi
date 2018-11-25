package BinaryTree;

import java.util.Stack;

public class DFS implements Visitors
{
    public boolean visit(BinaryNode pRoot) {
        System.out.print("DFS is: ");
        Stack<BinaryNode> res = new Stack<BinaryNode>();
        res.add(pRoot);
        while(res.size()>0){
            BinaryNode node = res.pop();
            System.out.print(node.getValue() + " ");
            if(node.getLeftValue()!=null)
                res.add(node.getLeftValue());
            if(node.getRightValue()!=null)
                res.add(node.getRightValue());
        }
        System.out.print("\n");
        return true;
    }
}
