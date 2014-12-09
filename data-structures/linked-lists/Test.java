/**
 * Created by rajin on 08-12-2014.
 */
public class Test {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> integerSinglyLinkedList = new SinglyLinkedList<Integer>();
        integerSinglyLinkedList.addFirst(1);
        integerSinglyLinkedList.addFirst(2);
        integerSinglyLinkedList.addLast(3);
        displayNodes(integerSinglyLinkedList);
        integerSinglyLinkedList.removeLast();
        displayNodes(integerSinglyLinkedList);
    }

    private static void displayNodes(SinglyLinkedList<Integer> integerSinglyLinkedList) {
        Node<Integer> integerNode = integerSinglyLinkedList.getFirstNode();
        System.out.println(integerNode.getT());
        Node<Integer> nextNode = integerNode.gettNode();
        while (nextNode != null) {
            System.out.println(nextNode.getT());
            nextNode = nextNode.gettNode();
        }
        System.out.println("size: " + integerSinglyLinkedList.getSize());
    }
}
