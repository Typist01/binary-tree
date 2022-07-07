import javax.naming.BinaryRefAddr;

public class BinaryNode {
    private BinaryNode leftNode;
    private BinaryNode rightNode;
    private int value;

    BinaryNode(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value=value;
    }

    public void createLeftNode(int value){
        this.leftNode = new BinaryNode(value);
    }
    public void createRightNode(int value){
        this.rightNode = new BinaryNode(value);
    }
    public Boolean hasLeft(){
        return !(leftNode==null);
    }

    public Boolean hasRight(){
        return !(rightNode==null);
    }
    public BinaryNode getLeftNode(){
        return leftNode;
    }
    public BinaryNode getRightNode(){
        return rightNode;
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
//        } else if (val==leftNode.value || val == rightNode.value) {
//            System.out.println("duplicate value");
//            return;
//        }
    }


