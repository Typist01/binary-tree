package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class BinaryTree extends BinaryNode{
    private BinaryNode currentNode;
    private int nodeCount;
    public BinaryTree(int rootVal) {
        super(rootVal);
        nodeCount++;
    }
//    public BinaryTree(){
//        super(null);
//    }

    public int getNodeCount(){
        return nodeCount;
    }
    //add a value to the tree
    public int insert(int val) throws Exception{
        this.currentNode = this;
        int result = this.add(val);
        if (result == 1)
            this.nodeCount++;
        return result;
    }
    // add a value to the tree, request is passed in from the insert method
    private int add(int val) throws Exception {
        if (val==this.currentNode.getValue()){
            throw new Exception("Value already in the tree");
        }else if (val < this.currentNode.getValue()) {
            if (!this.currentNode.hasLeft()) {
                this.currentNode.createLeftNode(val);
                return 1;
            } else {
                this.currentNode = this.currentNode.getLeftNode();
                return add(val);
            }
        } else { //val is greater so go right
            if (!this.currentNode.hasRight()) {
                this.currentNode.createRightNode(val);
                return 1;
            } else {
                this.currentNode = this.currentNode.getRightNode();
                return add(val);
            }
        }
    }
    public List toList(){
        TreeAdapter adapter = new TreeAdapter();
        long startTime = System.nanoTime();
        List result = adapter.toList(this);
        long endTime = System.nanoTime();
        System.out.println("Tree converted to a sorted list in " + (startTime-endTime)/1000000000 + " seconds.");
        return adapter.toList(this);
    }
    private void collectNodes(BinaryNode node, ArrayList intList){
        if (node.hasLeft())
            collectNodes(node.getLeftNode(), intList);
        System.out.println(node.getValue());
        intList.add(node.getValue());
        if (node.hasRight())
            collectNodes(node.getRightNode(), intList);
    }
}
