//import java.util.ArrayList;
//public class BinaryTree.BinaryTree{
//    private BinaryTree.BinaryNode tree;
//    private BinaryTree.BinaryNode currentNode;
//    private int nodeCount;
//    BinaryTree.BinaryTree(int rootVal) {
//        this.tree = new BinaryTree.BinaryNode(rootVal);
//        nodeCount++;
//    }
//    public BinaryTree.BinaryNode getTree(){
//        return this.tree; // returns root node
//    }
//    //add a value to the tree
//    public int insert(int val) throws Exception{
//        this.currentNode = tree;
//        int result = this.add(val);
//        if (result == 1)
//            this.nodeCount++;
//        return result;
//    }
//    // add a value to the tree, request is passed in from the insert method
//    private int add(int val) throws Exception {
//        if (val < this.currentNode.getValue()) {
//            if (!this.currentNode.hasLeft()) {
//                this.currentNode.createLeftNode(val);
//                return 1;
//            } else {
//                this.currentNode = this.currentNode.getLeftNode();
//                return add(val);
//            }
//        }
//        else if (val > this.currentNode.getValue()) {
//            if (!this.currentNode.hasRight()) {
//                this.currentNode.createRightNode(val);
//                return 1;
//            } else {
//                this.currentNode = this.currentNode.getRightNode();
//                return add(val);
//            }
//        }
//        if (val==this.currentNode.getValue()){
//            throw new Exception("Value already in the tree");
//        }
//        return 0;
//    }
//
////    private ArrayList toList(BinaryTree.BinaryTree myTree){
////        ArrayList<Integer> intList = new ArrayList();
////        collectNodes(tree, intList);
////        return intList;
////    }
//////    public int[] sortArray(int[] arrayToSort){
//////        currentNode = tree;
//////        int i = 0;
//////        getNodes(currentNode);
//////
//////    }
//    private void collectNodes(BinaryTree.BinaryNode node, ArrayList intList){
//        if (node.hasLeft())
//            collectNodes(node.getLeftNode(), intList);
//        System.out.println(node.getValue());
//        intList.add(node.getValue());
//        if (node.hasRight())
//            collectNodes(node.getRightNode(), intList);
//    }
//
//}
