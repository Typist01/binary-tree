package BinaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    BinaryTree myTree;
    int rootValue = 5;

    @BeforeEach
    void start(){
        myTree = new BinaryTree(rootValue);
    }

    @Test
    void getNodeCount() {
        Assertions.assertEquals(myTree.getNodeCount(), 1);
        try{
            myTree.insert(3);
            Assertions.assertEquals(myTree.getNodeCount(), 2);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void insert() {
        Assertions.assertThrows(Exception.class, ()-> myTree.insert(5)); // root value, already in the tree

        // regular insert
        try{
            myTree.insert(6);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}