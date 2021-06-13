package datastructures.linkedlist;

public class Node {

    private Integer value;
    private Node nextNode;

    public Node(int value) {
        this.value = value;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
