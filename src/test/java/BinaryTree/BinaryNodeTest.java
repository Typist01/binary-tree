package BinaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNodeTest {
    BinaryNode myNode;
    @BeforeEach
    void setUp() {
        myNode = new BinaryNode(3);
    }

    @Test
    void getValue() {
        Assertions.assertEquals(3, myNode.getValue());
    }

    @Test
    void setValue() {
        myNode.setValue(5);
        Assertions.assertEquals(5, myNode.getValue());
    }

    @Test
    void createLeftNode() {
        Assertions.assertNull(myNode.getLeftNode());
        myNode.createLeftNode(1);
        Assertions.assertEquals(1, myNode.getLeftNode().getValue());
    }

    @Test
    void createRightNode() {
        Assertions.assertNull(myNode.getRightNode());
        myNode.createRightNode(5);
        Assertions.assertEquals(5, myNode.getRightNode().getValue());
    }

    @Test
    void hasLeft() {
        Assertions.assertNull(myNode.getLeftNode());
        myNode.createLeftNode(2);
        Assertions.assertTrue(myNode.hasLeft());
    }

    @Test
    void hasRight() {
        Assertions.assertFalse(myNode.hasRight());
        myNode.createRightNode(4);
        Assertions.assertTrue(myNode.hasRight());
    }

    @Test
    void getLeftNode() {
        Assertions.assertNull(myNode.getRightNode());
        myNode.createLeftNode(2);
        Assertions.assertNotNull(myNode.getLeftNode());
        Assertions.assertEquals(2, myNode.getLeftNode().getValue());
    }

    @Test
    void getRightNode() {
        Assertions.assertNull(myNode.getRightNode());
        myNode.createRightNode(5);
        Assertions.assertNotNull(myNode.getRightNode());
        Assertions.assertEquals(5, myNode.getRightNode().getValue());
    }
}