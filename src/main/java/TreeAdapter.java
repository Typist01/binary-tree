import java.util.ArrayList;
import java.util.List;

public class TreeAdapter {
    public BinaryTree toTree (int[] myList){
        BinaryTree myTree = new BinaryTree(myList[0]);
        try{
            for (int i=1;i<myList.length;i++){
                System.out.println("inserting: " + myList[i]);
                myTree.insert(myList[i]);
            }
            return myTree;
        } catch(Exception e){
            e.printStackTrace();
        }
        return myTree;
    }
    public List toList(BinaryTree tree){
        ArrayList<Integer> intList = new ArrayList();
        collectNodes(tree, intList);
        return intList;
    }
    private void collectNodes(BinaryNode node, ArrayList intList){
        if (node.hasLeft())
            collectNodes(node.getLeftNode(), intList);
//        System.out.println(node.getValue());
        intList.add(node.getValue());
        if (node.hasRight())
            collectNodes(node.getRightNode(), intList);
    }
}
