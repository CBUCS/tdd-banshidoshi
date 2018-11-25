package BinaryTree;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFS implements Visitors {

        public boolean visit(BinaryNode pRoot) {
            System.out.print("BFS is: ");
            Queue<BinaryNode> queue= new ConcurrentLinkedQueue<BinaryNode>();
            queue.add(pRoot);
            while (queue.size()>0)
            {

                BinaryNode node = queue.poll();
                System.out.print(node.getValue() + " ");

                if (node.getLeftValue() != null) {
                    queue.add(node.getLeftValue());
                }
                if (node.getRightValue() != null) {
                    queue.add(node.getRightValue());
                }
            }
            System.out.print("\n");
            return true;
        }
    }

