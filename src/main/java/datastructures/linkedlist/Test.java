package datastructures.linkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAtFirst(3);
        linkedList.addAtFirst(13);
        linkedList.addAtFirst(34);
        linkedList.addAtFirst(35);
        linkedList.addAtFirst(43);
        linkedList.addLast(56);
        linkedList.addAtFirst(12);
        linkedList.addLast(13);
        linkedList.addLast(122);
        linkedList.addAtFirst(142);
        linkedList.removeFirst();


         linkedList.removeLast();

        linkedList.printElements();

        System.out.println("Index of 43 is :"+ linkedList.indexOf(122));
        System.out.println(linkedList.contains(314));

        System.out.println("Size " + linkedList.size());

        linkedList.reverse();

        linkedList.printElements();


    }
}
