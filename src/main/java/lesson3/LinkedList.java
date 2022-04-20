package lesson3;

public interface LinkedList<E>  {

    void insertFirst(E value);
    void insertMiddle(E value, int position);

    E removeFirst();
    E removeLast();


    boolean remove(E value);

    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();

    E getFirst();

    class Node<E> {
        E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value, Node<E> next, Node<E> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
