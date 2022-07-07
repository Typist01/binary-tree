import java.util.ArrayList;

public class BinaryTree{
    private BinaryNode tree;
    private BinaryNode currentNode;

    BinaryTree(int rootVal) {
        this.tree = new BinaryNode(rootVal);
    }

    public int insert(int val) throws Exception{
        this.currentNode = tree;
        return this.add(val);
    }

    private int add(int val) throws Exception {
        if (val < this.currentNode.getValue()) {
            System.out.println("left side");
            if (!this.currentNode.hasLeft()) {
                System.out.println("went left and found empty");
                this.currentNode.createLeftNode(val);
                return 1;
            } else {
                System.out.println("went left call function again");
                this.currentNode = this.currentNode.getLeftNode();
                return add(val);
            }
        }
        else if (val > this.currentNode.getValue()) {
            System.out.println("right side");
            if (!this.currentNode.hasRight()) {
                this.currentNode.createRightNode(val);
                return 1;
            } else {
                this.currentNode = this.currentNode.getRightNode();
                return add(val);
            }
        }
        if (val==this.currentNode.getValue()){
            throw new Exception("Value already in the tree");
        }
        return 0;
    }
    private ArrayList toList(BinaryTree myTree){
        currentNode = tree;
        ArrayList myList = new ArrayList();
        return myList;
    }
    private BinaryNode getLeftNodes(){
        if (!currentNode.hasLeft()){
            BinaryNode returnNode = currentNode;
            if (currentNode.hasRight())
                currentNode = currentNode.getRightNode();
            return returnNode;
        }
        else {
            currentNode = currentNode.getLeftNode();
        }
    }



//    public void createNewNode(int val){
//        if(val<this.value){
//            if (this.leftNode==null)
//                this.leftNode = new BinaryNode(val);
//            else
//                currentNode = getLeftNode();
//
//        } else if (val>this.value){
//            if (this.rightNode==null)
//                this.rightNode = new BinaryNode(val);
//        }
//    } else if (val==leftNode.value || val == rightNode.value) {
//        System.out.println("duplicate value");
//        return;
//    }
//}
}
