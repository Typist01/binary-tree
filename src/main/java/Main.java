import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] myList = {3, 2, 1, 4};
        BinaryTree myTree = listToTree(myList);
//        BinaryNode myNode = myNode = new BinaryNode(3);


//        System.out.println(myTree.tree.getRightNode().getValue());
//        BinaryTree myTree = new BinaryTree(3);
//        try{
//            myTree.insert(2);
//            System.out.println(myTree.Tree.hasLeft());
//            myTree.insert(1);
//        }catch(Exception e){
//            e.printStackTrace();
//        }

//    BinaryTree myTree = new BinaryTree(3);
//    try{
//        myTree.insert(2);
//        System.out.println(myTree.tree.getLeftNode().hasLeft());
//
//
//    } catch(Exception e){
//        e.printStackTrace();
//        }
    }

    static BinaryTree listToTree(int[] myList){
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



}
