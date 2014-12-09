/**
 * Created by rajin on 08-12-2014.
 */
public class SinglyLinkedList<T> {

    private Node<T> fNode;
    private Node<T> lNode;

    private int size;

    public void addFirst(T t) {
        if (t == null) {
            return;
        }
        if (null == fNode) {
            fNode = lNode = new Node<T>(t, null);
        } else {
            Node<T> f = fNode;
            Node<T> tNode = new Node<T>(t, f);
            fNode = tNode;
        }
        size++;
    }

    public void addAfter(T t, T x) {
        /*if (t == null || x == null) {
            return;
        }
        Node<T> mNode = new Node<T>(t, null);
        Node<T> temp = fNode;
        while (temp.t == x) {
            temp = temp.tNode;
        }*/
    }

    public void addLast(T t) {
        if (t == null) {
            return;
        }
        if (null == lNode) {
            fNode = lNode = new Node<T>(t, null);
        } else {
            Node<T> tNode = new Node<T>(t, null);
            lNode.tNode = tNode;
            lNode = tNode;
        }
        size++;
    }

    public void removeFirst() {
        if (fNode == null) {
            return;
        }
        Node<T> nNode = fNode.tNode;
        fNode = nNode;
        size--;
    }

    public void removeLast() {
        if (fNode == null) {
            return;
        }
        Node<T> nNode = fNode.tNode;
        while (nNode != null && nNode.tNode != lNode) {
            nNode = nNode.tNode;
        }
        nNode.tNode = null;
        lNode = nNode;
        size--;
    }

    public void add(T t) {
        addLast(t);
    }

    public void remove() {
        removeLast();
    }

    public Node<T> getFirstNode() {
        return fNode;
    }

    public Node<T> getLastNode() {
        return lNode;
    }

    public int getSize() {
        return size;
    }
}
