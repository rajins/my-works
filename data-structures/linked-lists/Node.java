/**
 * Created by rajin on 08-12-2014.
 */
public class Node<T> {
    T t;
    Node<T> tNode;

    public Node(T t, Node<T> tNode) {
        this.t = t;
        this.tNode = tNode;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> gettNode() {
        return tNode;
    }

    public void settNode(Node<T> tNode) {
        this.tNode = tNode;
    }
}
