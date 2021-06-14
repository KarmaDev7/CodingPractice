package datastructures.linkedlist;

import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    void addAtFirst(int value){
        size++;

        Node node = new Node(value);

        if(isEmpty()) {
           first = last = node;
            return;
        }

        node.setNextNode(first);
        first = node;



    }

    void printElements(){
        Node pointer = first;

        while (pointer !=null){
            System.out.println(pointer.getValue());
            pointer = pointer.getNextNode();
        }
    }

    void addLast(int value){

        size++;

        Node node = new Node(value);

        if (isEmpty()) {
            first = last =node;
        }
        else {
            last.setNextNode(node);
            last = node;
        }


    }


    void removeFirst() {


        if (isEmpty())
            throw new NoSuchElementException();

        size--;

        /**
         * Only one element in the linked List
         */
        if (first == last){
            first = last = null;
                return;
        }

        Node second = first.getNextNode();
        first.setNextNode(null);
        first = second;



    }

    public void removeLast(){

        if(isEmpty())
            throw new NoSuchElementException();

        size--;

        if(first == last) {
            first = last = null;
            return;
        }

        last = getPreviousNode(last);
        last.setNextNode(null);



    }

    private Node getPreviousNode(Node node) {
        Node current = first;

        while (current != null){
          if (Objects.equals(current.getNextNode(),node))
                return current;

          current = current.getNextNode();

        }

        return null;
    }


    public int indexOf(int value){
        int index = 0;
        Node current  = first;

        while (current !=null){

            if(Objects.equals(current.getValue(),value)) {
                return index;
            }
            index++;
            current = current.getNextNode();

        }

        return -1;

    }

    public void reverse(){
         Node previous = first;
         Node current = first.getNextNode();

        while (current !=null){
            /**
             * Keeping track of next node.
             */
            Node next = current.getNextNode();

            /**
             * Pointing to previous node.
             */
            current.setNextNode(previous);

            /**
             * Moving forward for next node.
             */
            previous = current;
            current = next;

        }
        last = first;
        first.setNextNode(null);
        /**
         * As the current node will be null,when loop ends. so previous node will be first node.
         */
        first = previous;




    }


    public Node findNodeAtPosition(int k){

        if(k > size)
            throw new NoSuchElementException();

        Node nodeK = first;
        Node currentNode = first;

        while (k-1 > 0){
            currentNode = currentNode.getNextNode();
            k--;
        }

        while (currentNode !=null)
        {
            currentNode= currentNode.getNextNode();
            nodeK = nodeK.getNextNode();
        }

        return nodeK;

    }


    public Boolean contains(int value){
        return indexOf(value) != -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int size(){
        return size;
    }

}
