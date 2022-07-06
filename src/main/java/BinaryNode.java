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
        BinaryNode leftNode = new BinaryNode(value);

    }
    public void createRightNode(int value){
            BinaryNode rightNode = new BinaryNode(value);
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
    public void createNewNode(int val){
        if (rightNode==null && val>this.value){
            rightNode = new BinaryNode(val);
        } else if(leftNode == null && val<this.value){
            leftNode = new BinaryNode(val);
        } else if (val==leftNode.value || val == rightNode.value) {
            System.out.println("duplicate value");
        } else{
            System.out.println("both nodes taken");
        }
    }








}
